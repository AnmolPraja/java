import model.Order;
import model.Tshirt;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] size = {"XL","Medium","Large"};
        Tshirt tShirt1 = new Tshirt("Gorkhali Batman", "572Brand: Karuna", 1235,"New Fashion", "You either die a hero or live long enough to see yourself be a villain", size);
        Tshirt tShirt2 = new Tshirt("Another T-Shirt", "681Brand: Baruna", 1780, "Old Fashion", "Don't Overthink and just do it", size);
        tShirt1.describe();
        tShirt2.describe();


        List<Tshirt> List1 = new ArrayList<>();
        List1.add(tShirt1);
        List1.add(tShirt2);


        Order order1 = new Order("Gopal Sharma", "0486756465",List1);
        Order order2 = new Order("Anmol Prajapati", "0490134149",List1);

        order1.displayBill(10);
    }
}