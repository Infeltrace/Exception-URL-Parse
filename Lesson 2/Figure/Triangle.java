package com.company;

public class Triangle extends ClassFigura {

    private int a, b, c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){
        super("Triangle");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getSquare() {

        double s, p;

        p = (a+b+c)/2;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

//    public double getSquare(){
//        return getHeight() * (a / 2);
//    }
//
//    private double getHeight(){
//        double p = 0.5*(a + b + c);
//        return 2*Math.sqrt(p*(p - a)*(p - b)*(p - c))/a;
//    }
}
