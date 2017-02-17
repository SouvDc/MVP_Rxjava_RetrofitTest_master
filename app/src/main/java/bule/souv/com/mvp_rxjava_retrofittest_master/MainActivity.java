package bule.souv.com.mvp_rxjava_retrofittest_master;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import bule.souv.com.mvp_rxjava_retrofittest_master.bean.WeatherInfoBean;
import bule.souv.com.mvp_rxjava_retrofittest_master.presenter.WeatherPresenterImp;
import bule.souv.com.mvp_rxjava_retrofittest_master.view.WeatherView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements WeatherView{

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.main_getweather_temp_btn)
    Button mainGetweatherTempBtn;
    @Bind(R.id.main_showweather_temp_tv)
    TextView mainShowweatherTempTv;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    /**  对象定义  **/
    private WeatherPresenterImp weatherPresenterImp = null;
    private ProgressDialog progressDialog = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        init();

    }

    /**
     * @descriptoin	点击获取温度
     * @author
     * @param
     * @date 2017/2/16 15:52
     * @return
     */
    @OnClick(R.id.main_getweather_temp_btn)
    public void setOnClickRequestWeatherBtn(){
        weatherPresenterImp.loadWeather("c5bb749112664353af44bc99ed263857", "长沙");
    }

    /**
     * @descriptoin	初始化
     * @author	dc
     * @date 2017/2/16 15:44
     */
    private void init(){
        weatherPresenterImp = new WeatherPresenterImp(this,this);
        progressDialog = new ProgressDialog(MainActivity.this);
//        progressDialog.setTitle();
        progressDialog.setMessage("正在请求获取数据,请稍等!!!");
    }


    @Override
    public void showProgress() {
        if(progressDialog != null && !progressDialog.isShowing()){
            progressDialog.show();
        }
    }

    @Override
    public void disimissProgress() {
        if(progressDialog != null && progressDialog.isShowing()){
            progressDialog.dismiss();
        }
    }


    @Override
    public void loadDataSuccess(WeatherInfoBean tData) {
        String temperature = tData.getResult().getRealtime().getWeather().getTemperature();
        mainShowweatherTempTv.setVisibility(View.VISIBLE);
        mainShowweatherTempTv.setText("当前的气温为：" + temperature + "℃");
    }

    @Override
    public void loadDataError(Throwable throwable) {
        String errorMsg = throwable.getMessage();
        mainShowweatherTempTv.setVisibility(View.VISIBLE);
        mainShowweatherTempTv.setText(errorMsg);
    }

    @Override
    protected void onStop() {
        super.onStop();
        weatherPresenterImp.unSubscribe();
    }
}
