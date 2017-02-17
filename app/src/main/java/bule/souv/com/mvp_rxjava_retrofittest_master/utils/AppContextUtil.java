package bule.souv.com.mvp_rxjava_retrofittest_master.utils;

import android.content.Context;

public class AppContextUtil {
    private static Context sContext;

    private AppContextUtil() {

    }

    public static void init(Context context) {
        sContext = context;
    }

    public static Context getInstance() {
        if (sContext == null) {
            throw new NullPointerException("the context is null,please init AppContextUtil in Application first.");
        }
        return sContext;
    }
}
