package com.jaffa.hardy.mvpdemo.contract;

import com.jaffa.hardy.mvpdemo.model.Login;

public interface LoginContract {
    interface LoginModel {
        void login(String username , String passWord,LoginCallBack callBack);
    }

    interface LoginView {

        void onCheckFormatSucess();
        void onCheckFormatFail(String info);
        void onLoginSucess(Login login);
        void onLoginFail(String errorInfo);

    }

    interface LoginCallBack {
         void onSuccess(Login login);
         void onFail(String  errorInfo);
    }
}
