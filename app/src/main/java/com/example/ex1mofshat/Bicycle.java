package com.example.ex1mofshat;

public class Bicycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("the Bicycle started driving");
    }
    @Override
    public void stop() {
        System.out.println("the Bicycle stopped driving");
    }
    @Override
    public void accelerate(){
        System.out.println("the Bicycle sped up");
    }
}
