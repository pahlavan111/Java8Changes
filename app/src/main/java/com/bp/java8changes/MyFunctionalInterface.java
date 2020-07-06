package com.bp.java8changes;

// functional interface just has one abstract method and it can has some default method
// if a functional interface extends another interface that has one or more method it most override its methods and cant be a functional interface

@FunctionalInterface
public interface MyFunctionalInterface {

    void myMethod();
}
