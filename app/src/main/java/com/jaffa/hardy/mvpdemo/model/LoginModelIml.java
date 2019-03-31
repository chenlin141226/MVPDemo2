package com.jaffa.hardy.mvpdemo.model;

import com.jaffa.hardy.mvpdemo.contract.LoginContract;

public class LoginModelIml implements LoginContract.LoginModel {
    @Override
    public void login(String username, String passWord, LoginContract.LoginCallBack callBack) {
        //网络请求

//        LoginNetUtils.getInstance().login(name, password, new BaseSubscriber<Login>() {
//            @Override
//            public void onSuccess(Login login) {
//                callBack.onSuccess(login);
//            }
//
//            @Override
//            public void onFail(String info) {
//                callBack.onFail(info);
//            }
//        });

    }
}
