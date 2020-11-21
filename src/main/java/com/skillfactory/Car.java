package com.skillfactory;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract class Car extends Transport implements Rideable{
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    public Car() {
        this("Mazda",198,false,10);
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        this.type = "Car";
    }

    void setAcceleration(float acceleration){
        this.acceleration = acceleration;
    }

    float countSpeed(float time){
        return (100/acceleration)*time;
    }
    abstract void start();

//    @Override
//    public void ride() {
//        System.out.println("Riding Car");
////        protectedType ="dd";
//
//    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        return brand != null ? brand.hashCode() : 0;
    }
}
