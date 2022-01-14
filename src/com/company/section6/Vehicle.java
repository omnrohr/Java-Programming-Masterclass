package com.company.section6;

public class Vehicle {
    private String name;
    private int size;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentVelocity =0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
    this.currentVelocity = velocity;
    this.currentDirection = direction;
        System.out.println("vehicle.move(): Moving at: " + currentVelocity + " KM, in direction: " + direction);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public void stop(){
        currentVelocity = 0;
    }
}
