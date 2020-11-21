package com.skillfactory;

public interface Swimmable {
    int MAX_DISTANCE =290;
    default void swim(){
//        MAX_DISTANCE++;
        System.out.println("Swimming");
    }
}
