package com.example.ex1mofshat;

public class Motorcycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("the Motorcycle started driving");
    }
    @Override
    public void stop() {
        System.out.println("the Motorcycle stopped driving");
    }
    @Override
    public void accelerate(){
        System.out.println("the Motorcycle sped up");
    }
}
