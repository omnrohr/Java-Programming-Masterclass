package com.company.section6;

public class Car extends Vehicle{
    private int wheels;
    private int gear;
    private int doors;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int size, int wheels, int gear, int doors, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gear = gear;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.Gear changed to: " + this.currentGear + " gear");
    }

    public void gear(){}

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.change velocity to: " + speed + " in direction: " + direction);
        move(speed, direction);
    }

}
