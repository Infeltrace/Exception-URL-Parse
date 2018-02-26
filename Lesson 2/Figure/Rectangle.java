package com.company;

public class Rectangle extends Triangle{

    public Rectangle(int height, int width){

        this.height = height;
        this.width = width;
    }

    protected Rectangle(){

    }

    @Override
    public double getSquare() {
        return height*width;
    }
}
