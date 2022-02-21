package com.example.points;

public class Point {
    protected double x;
    protected double y;

    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(){
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcDistance(Point point){
        int a = (int) (point.getX() - this.getX());
        int b = (int) (point.getY() - this.getY());

        return Math.sqrt(a*a + b*b);
    }

    public boolean compare(Point p){
        return(this.x == p.getX() && this.y == p.getY());
    }

    public void moveTo(int x, int y){
        setX(x);
        setY(y);
    }

    public String toString(){
        return "x=" +this.getX()+ "y=" +this.getY();
    }
}
