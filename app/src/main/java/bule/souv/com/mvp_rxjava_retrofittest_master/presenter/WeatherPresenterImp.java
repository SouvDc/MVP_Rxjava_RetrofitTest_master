package bule.souv.com.mvp_rxjava_retrofittest_master.presenter;

import android.content.Context;

import bule.souv.com.mvp_rxjava_retrofittest_master.base.BasePresenterImp;
import bule.souv.com.mvp_rxjava_retrofittest_master.bean.WeatherInfoBean;
import bule.souv.com.mvp_rxjava_retrofittest_master.model.WeatherModelImp;
import bule.souv.com.mvp_rxjava_retrofittest_master.view.WeatherView;

/**
 * 描述：MVP中的P实现类
 * 作者：dc on 2017/2/16 15:17
 * 邮箱：597210600@qq.com
 */
public class WeatherPresenterImp extends BasePresenterImp<WeatherView,WeatherInfoBean> implements WeatherPresenter { //传入泛型V和T分别为WeatherView、WeatherInfoBean表示建立这两者之间的桥梁
    private Context context = null;
    private WeatherModelImp weatherModelImp = null;

    /**
     * @descriptoin 构造方法
     * @param view 具体业务的视图接口对象
     * @author dc
     * @date 2017/2/16 15:12
     */
    public WeatherPresenterImp(WeatherView view, Context context) {
        super(view);
        this.context = context;
        this.weatherModelImp = new WeatherModelImp(context);
    }

    @Override
    public void loadWeather(String key, String city) {
        weatherModelImp.loadWeather(key, city, this);
    }

    @Override
    public void unSubscribe() {
        weatherModelImp.onUnsubscribe();
    }
}
