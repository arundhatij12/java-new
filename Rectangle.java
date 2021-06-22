package com.company;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        if (width<0)
            return this.width=0;
        else
            return width;
    }

    public double getLength() {
        if (length<0)
            return this.length=0;
        else
            return length;
    }

    public double getArea(){
        return width*length;
    }
}
