package com.skillfactory;

public class Boat implements Rideable, Swimmable{

    @Override
    public void ride() {
        System.out.println("Riding Boat");
    }

}
