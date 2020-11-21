package com.skillfactory;

public class Sedan extends Car{
    public Sedan(String brand, int horsePower, boolean isAwd, float acceleration) {
        super(brand, horsePower, isAwd, acceleration);
    }

    @Override
    void start() {
        System.out.println("Starting Sedan");
    }

    @Override
    public void ride() {

    }

//    @Override
//    public String toString() {
//        return "Sedan{" +
//                "brand='" + brand + '\'' +
//                ", horsePower=" + horsePower +
//                ", isAwd=" + isAwd +
//                ", acceleration=" + acceleration +
//                ", type='" + type + '\'' +
//                '}';
//    }
}
