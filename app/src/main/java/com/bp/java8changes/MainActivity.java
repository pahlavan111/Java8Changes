package com.bp.java8changes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements InterfaceWithDefaultMethod {
    private static final String TAG_KEY = "behrooz_log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.b();

        // 3 type of using interface
        //--1
        MyFunctionalInterface mi = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                Log.d(TAG_KEY, "this is a massage from my method");
            }
        };
        mi.myMethod();

        //--2
        MyFunctionalInterface mi2 = () -> {
            Log.d(TAG_KEY, "this is a massage from my method mi2");
        };
        mi2.myMethod();

        //--3
        // if you have just one line no need to curly braces
        MyFunctionalInterface mi3 = () -> Log.d(TAG_KEY, "this is a massage from my method mi3");
        mi3.myMethod();


    }

    @Override
    public void a() {

    }

}