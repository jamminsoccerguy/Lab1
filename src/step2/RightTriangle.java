package step2;

/**
 * Created by Pluck on 1/26/2016.
 */


public class RightTriangle {

    private double height;
    private double base;

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    public double getPerimeter() {
        double hypotenuse = (Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));

        return (base + height + hypotenuse);
    }

    public double getArea() {

        return (height * base) / 2;
    }
}


