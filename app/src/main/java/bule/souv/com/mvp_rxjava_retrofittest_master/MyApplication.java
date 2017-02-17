package bule.souv.com.mvp_rxjava_retrofittest_master;

import android.app.Application;
import android.content.Context;

import bule.souv.com.mvp_rxjava_retrofittest_master.utils.AppContextUtil;

/**
 * 描述：
 * 作者：dc on 2017/2/16 10:54
 * 邮箱：597210600@qq.com
 */
public class MyApplication extends Application {

    public static Context applicationContext;


    public static Context getContext() {
        return applicationContext;
    }



    @Override
    public void onCreate() {
        super.onCreate();
        AppContextUtil.init(this);
        applicationContext = this;
    }
}
