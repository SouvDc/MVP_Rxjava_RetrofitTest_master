package bule.souv.com.mvp_rxjava_retrofittest_master.presenter;

/**
 * 描述：MVP中的P接口定义
 * 作者：dc on 2017/2/16 15:17
 * 邮箱：597210600@qq.com
 */
public interface WeatherPresenter {

    /**
     * @descriptoin	请求天气数据
     * @author	dc
     * @param key key
     *            @param city 城市
     * @date 2017/2/17 19:36
     * @return
     */
    void loadWeather(String key, String city);

    /**
     * @descriptoin	注销subscribe
     * @author	dc
     * @date 2017/2/17 19:36
     */
    void unSubscribe();
}
