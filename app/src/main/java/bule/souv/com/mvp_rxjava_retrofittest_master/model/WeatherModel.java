package bule.souv.com.mvp_rxjava_retrofittest_master.model;

import bule.souv.com.mvp_rxjava_retrofittest_master.base.IBaseRequestCallBack;

/**
 * 描述：MVP中的M；处理获取网络天气数据
 * 作者：dc on 2017/2/16 11:03
 * 邮箱：597210600@qq.com
 */
public interface WeatherModel<T> {

    /**
     * @descriptoin	获取网络数据
     * @author	dc
     * @param city 城市
     *             @param key key
     *                        @param iBaseRequestCallBack 数据的回调接口
     * @date 2017/2/17 19:01
     */
    void loadWeather(String city,String key, IBaseRequestCallBack<T> iBaseRequestCallBack);

    /**
     * @descriptoin	注销subscribe
     * @author
     * @param
     * @date 2017/2/17 19:02
     * @return
     */
    void onUnsubscribe();
}
