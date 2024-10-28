package com.example.ex1mofshat;

public class Car  extends Vehicle{
    @Override
    public void start() {
        System.out.println("the car started driving");
    }
    @Override
    public void stop() {
        System.out.println("the car stopped driving");
    }
    @Override
    public void accelerate(){
        System.out.println("the car sped up");
    }
}