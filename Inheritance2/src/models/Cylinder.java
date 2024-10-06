package models;

public class Cylinder extends Circle {
    int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public void getAreaCylinder() {
        System.out.println("Area of cylinder: " + (22.0 / 7) * radius * radius * height);
    }
}
