package com.example.minht.mvvm.Model;

import android.databinding.BaseObservable;

import com.example.minht.mvvm.BR;

/**
 * Created by minht on 4/11/2018.
 */

public class User{
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
