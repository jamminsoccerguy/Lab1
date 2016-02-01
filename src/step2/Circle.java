package step2;

/**
 * Created by Pluck on 1/26/2016.
 */


public class Circle {

    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }

    public double getArea(){

        return (Math.PI * (Math.pow(radius, 2)));
    }
}