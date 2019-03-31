package com.jaffa.hardy.mvpdemo.presenter;

import android.text.TextUtils;

import com.jaffa.hardy.mvpdemo.contract.LoginContract;
import com.jaffa.hardy.mvpdemo.model.Login;
import com.jaffa.hardy.mvpdemo.model.LoginModelIml;

public class LoginPresenter extends BasePresenter<LoginContract.LoginView> {
    private LoginModelIml model;

    public LoginPresenter() {
        model = new LoginModelIml();
    }

    /**
     * 检查格式
     *
     * @param name
     * @param password
     */
    public void checkFormat(String name, String password) {
        if (TextUtils.isEmpty(name)) {
            getView().onCheckFormatFail("请输入用户名");
        } else if (TextUtils.isEmpty(password)) {
            getView().onCheckFormatFail("请输入密码");
        } else if (password.length() < 6 || password.length() > 18) {
            getView().onCheckFormatFail("密码格式不正确");
        } else {
            getView().onCheckFormatSucess();
            login(name, password);
        }
    }


    /**
     * 登录
     *
     * @param name
     * @param password
     */
    public void login(String name, String password) {
        model.login(name, password, new LoginContract.LoginCallBack() {
            @Override
            public void onSuccess(Login login) {
                getView().onLoginSucess(login);
            }

            @Override
            public void onFail(String errorInfo) {
                getView().onLoginFail(errorInfo);
            }
        });
    }



}
