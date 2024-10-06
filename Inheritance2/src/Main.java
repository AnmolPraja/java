import models.Circle;
import models.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Cylinder cy1 = new Cylinder(5,10);

        c1.getAreaCircle();
        cy1.getAreaCylinder();
    }
}