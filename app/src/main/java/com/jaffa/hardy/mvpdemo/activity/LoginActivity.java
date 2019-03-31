package com.jaffa.hardy.mvpdemo.activity;

import android.os.Bundle;

import com.jaffa.hardy.mvpdemo.R;
import com.jaffa.hardy.mvpdemo.base.BaseActivity;
import com.jaffa.hardy.mvpdemo.contract.LoginContract;
import com.jaffa.hardy.mvpdemo.model.Login;
import com.jaffa.hardy.mvpdemo.presenter.LoginPresenter;

public class LoginActivity extends BaseActivity<LoginContract.LoginView,LoginPresenter> implements LoginContract.LoginView{
    @Override
    protected void initActivityView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void getData() {

    }

    @Override
    public void onCheckFormatSucess() {

    }

    @Override
    public void onCheckFormatFail(String info) {

    }

    @Override
    public void onLoginSucess(Login login) {

    }

    @Override
    public void onLoginFail(String errorInfo) {

    }
}
