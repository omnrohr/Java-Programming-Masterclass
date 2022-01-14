package com.company.section6;

//public class Carpet {
//    private double cost;
//
//    public Carpet(double cost){
//        this.cost = cost >=0 ? cost:0;
//    }
//    public double getCost(){
//        return this.cost;
//    }
//
//}

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if(cost < 0) this.cost = 0;
        else this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
