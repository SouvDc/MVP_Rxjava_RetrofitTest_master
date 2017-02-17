package bule.souv.com.mvp_rxjava_retrofittest_master.base;

/**
 * 描述：
 *  * 代理对象的基础实现 ：  一些基础的方法
 *
 * @param <V> 视图接口对象(view) 具体业务各自继承自IBaseView
 * @param <T> 业务请求返回的具体对象
 * 作者：dc on 2017/2/16 15:07
 * 邮箱：597210600@qq.com
 */
public class BasePresenterImp<V extends IBaseView , T> implements IBaseRequestCallBack<T> {

    private IBaseView iBaseView = null;  //基类视图

    /**
     * @descriptoin	 构造方法
     * @author	dc
     * @param view 具体业务的视图接口对象
     * @date 2017/2/16 15:12
     */
    public BasePresenterImp(V view) {
        this.iBaseView = view;
    }

    /**
     * @descriptoin	请求之前显示progress
     * @author	dc
     * @date 2017/2/16 15:13
     */
    @Override
    public void beforeRequest() {
        iBaseView.showProgress();
    }

    /**
     * @descriptoin	请求异常显示异常信息
     * @author	dc
     * @param throwable 异常信息
     * @date 2017/2/16 15:13
     */
    @Override
    public void requestError(Throwable throwable) {
        iBaseView.loadDataError(throwable);
        iBaseView.disimissProgress(); //请求错误，提示错误信息之后隐藏progress
    }

    /**
     * @descriptoin	请求完成之后隐藏progress
     * @author	dc
     * @date 2017/2/16 15:14
     */
    @Override
    public void requestComplete() {
        iBaseView.disimissProgress();
    }

    /**
     * @descriptoin	请求成功获取成功之后的数据信息
     * @author	dc
     * @param callBack 回调的数据
     * @date 2017/2/16 15:14
     */
    @Override
    public void requestSuccess(T callBack) {
        iBaseView.loadDataSuccess(callBack);
    }

}
