package bule.souv.com.mvp_rxjava_retrofittest_master.api;

import bule.souv.com.mvp_rxjava_retrofittest_master.bean.WeatherInfoBean;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 描述：retrofit的接口service定义
 * 作者：dc on 2017/2/16 11:10
 * 邮箱：597210600@qq.com
 */
public interface WeatherServiceApi {

    //请求的接口地址：http://api.avatardata.cn/Weather/Query?key=75bfe88f27a34311a41591291b7191ce&cityname=%E9%95%BF%E6%B2%99
    @GET("Weather/Query?")
    Observable<WeatherInfoBean> loadWeatherInfo(@Query("key") String key,@Query("cityname") String cityname);

}
