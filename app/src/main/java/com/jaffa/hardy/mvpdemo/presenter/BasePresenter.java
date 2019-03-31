package com.jaffa.hardy.mvpdemo.presenter;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public abstract class BasePresenter<T> {
    //View接口类型的软引用
    protected Reference<T> mViewRef;

    public void attachView(T view) {
        mViewRef = new SoftReference<T>(view);
    }

    protected T getView() {
        return mViewRef.get();
    }

    public boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
        }
    }

}