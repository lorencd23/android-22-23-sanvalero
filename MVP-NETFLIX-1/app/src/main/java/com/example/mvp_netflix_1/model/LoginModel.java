package com.example.mvp_netflix_1.model;

import com.example.mvp_netflix_1.contract.LoginContract;
import com.example.mvp_netflix_1.model.pojo.User;

public class LoginModel implements LoginContract.Model {
    @Override
    public void findUserWS(User user, OnLoginUserListener onLoginUserListener) {

    }
}
