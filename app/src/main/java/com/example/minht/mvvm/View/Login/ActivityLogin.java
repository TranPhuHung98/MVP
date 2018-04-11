package com.example.minht.mvvm.View.Login;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.minht.mvvm.Model.User;
import com.example.minht.mvvm.Presenter.PresenterLogin.PresenterImpLogin;
import com.example.minht.mvvm.Presenter.PresenterLogin.PresenterLogin;
import com.example.minht.mvvm.R;
import com.example.minht.mvvm.View.HomePage.ActivityHomePage;
import com.example.minht.mvvm.databinding.ActivityMainBinding;

public class ActivityLogin extends AppCompatActivity implements ViewUserLogin{
    private ActivityMainBinding activityMainBinding;
    private PresenterLogin presenterLogin;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User("","");
        presenterLogin = new PresenterImpLogin(this);
        activityMainBinding.setUser(user);
        activityMainBinding.setPresenterLogin(presenterLogin);


    }

    @Override
    public void loginFailed() {
        Toast.makeText(this,"Login Failed " + user.getEmail() + " " + user.getPassword() ,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Intent intent = new Intent(ActivityLogin.this,ActivityHomePage.class);
        startActivity(intent);
        //Don't comeback login
        finish();
    }

}
