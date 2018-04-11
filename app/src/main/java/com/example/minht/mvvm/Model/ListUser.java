package com.example.minht.mvvm.Model;

import android.databinding.ObservableArrayList;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minht on 4/11/2018.
 */

public class ListUser {
    private ObservableArrayList<User> list;

    public ListUser(){
        list = new ObservableArrayList<>();
        list.add(new User("tuandeptrai1","123"));
        list.add(new User("tuandeptrai2","123"));
        list.add(new User("tuandeptrai3","123"));
        list.add(new User("tuandeptrai4","123"));
        list.add(new User("tuandeptrai5","123"));
        list.add(new User("tuandeptrai6","123"));
        list.add(new User("tuandeptrai7","123"));
    }

    public ObservableArrayList<User> getListUser(){
        return this.list;
    }


}
