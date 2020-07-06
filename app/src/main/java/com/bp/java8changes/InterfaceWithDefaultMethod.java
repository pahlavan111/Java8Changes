package com.bp.java8changes;


import android.util.Log;

public interface InterfaceWithDefaultMethod {

    void a();

//        Extension methods are not supported at language level '7'
//        Default method requires API level 24
//        we can have mire than  one default method
//        you have can not to implement default methods when you implement this interface

    default void b() {

        Log.d("LOG", "this message is from interface default method");
    }


}
