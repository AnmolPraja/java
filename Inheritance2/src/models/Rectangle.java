package models;

public class Rectangle {
    int length;
    int bredth;

    public Rectangle(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public void getAreaRectangle(){
        System.out.println("Area of rectangle is " + length * bredth);
    }
}
