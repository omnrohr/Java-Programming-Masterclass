package com.company.section6;

public class Bmw extends Car{
    private int warranty;

    public Bmw(int warranty) {
        super("BMW", 4, 5, 5, 5, false);
        this.warranty = warranty;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
            }
        else if (newVelocity >0 && newVelocity <=10) changeGear(1);
        else if (newVelocity >10 && newVelocity <=20) changeGear(2);
        else if (newVelocity >20 && newVelocity <=40) changeGear(3);
        else if (newVelocity >40 && newVelocity <=60) changeGear(4);
        else changeGear(5);

        if (newVelocity > 0) changeVelocity(newVelocity, getCurrentDirection());
    }
}
