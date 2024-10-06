package models;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void getAreaCircle(){
        System.out.println("Area of circle: " + (22.0/7) * radius * radius);
    }
}
