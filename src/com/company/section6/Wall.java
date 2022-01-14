package com.company.section6;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0.00, 0.00);
    }
    public Wall(double width, double height){
        this.width = width >=0 ? width:0;
        this.height = height >=0 ?height :0;
    }
    public void setWidth(double width) {
        if (width <= 0) width =0;
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <=0) height=0;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea(){
        return this.height * this.width;
    }
}
