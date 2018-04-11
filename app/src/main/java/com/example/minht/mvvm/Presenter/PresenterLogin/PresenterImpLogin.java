package com.example.minht.mvvm.Presenter.PresenterLogin;

import android.databinding.ObservableArrayList;

import com.example.minht.mvvm.Model.ListUser;
import com.example.minht.mvvm.Model.User;
import com.example.minht.mvvm.View.Login.ViewUserLogin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minht on 4/11/2018.
 */

public class PresenterImpLogin implements PresenterLogin {
    private ViewUserLogin viewUserLogin;
    private ListUser listUser;

    public PresenterImpLogin(ViewUserLogin viewUserLogin){
        this.viewUserLogin = viewUserLogin;
    }

    @Override
    public void checkLogin(String email,String password) {
        //Get Data From Model
        Boolean check = true;
        listUser = new ListUser();
        ObservableArrayList<User> list = listUser.getListUser();
        for(int i=0; i < list.size(); i++)
            if( email.equals(list.get(i).getEmail() )) {
                viewUserLogin.loginSuccess();
                check = false;
                break;
            }
        if( check )
            viewUserLogin.loginFailed();
    }
}
