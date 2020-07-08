package com.bp.java8changes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.bp.java8changes.method_refrence.Fi;
import com.bp.java8changes.method_refrence.SeyHello;

public class MainActivity extends AppCompatActivity implements InterfaceWithDefaultMethod {
    private static final String TAG_KEY = "behrooz_log";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.b();


        //-----------------------------------------------------------------------------------------------
        // 3 type of using interface
        //--1
        MyFunctionalInterface mfi1 = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                Log.d(TAG_KEY, "this is a massage from my method");
            }
        };
        mfi1.myMethod();

        //--2
        MyFunctionalInterface mfi2 = () -> {
            Log.d(TAG_KEY, "this is a massage from my method mfi2");
        };
        mfi2.myMethod();

        //--3
        // if you have just one line no need to curly braces
        MyFunctionalInterface mfi3 = () -> Log.d(TAG_KEY, "this is a massage from my method mfi3");
        mfi3.myMethod();
//---------------------------------------------------------------------------------------------------------


        MyFunctionalInterface2 mfi4 = str -> Log.d(TAG_KEY,str);
        mfi4.Method("hey I am from mfi4 with a String Argument");

        //or
        MyFunctionalInterface2 mfi5 = (s) -> Log.d(TAG_KEY,s);
        mfi5.Method("hey I am from mfi5 with a String Argument");




        // method reference ----------------------------

        SeyHello seyHello= new SeyHello();
        Fi fi= seyHello::SeyHi;

        Log.d(TAG_KEY, fi.a());

    }

    @Override
    public void a() {

    }

}