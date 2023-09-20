import java.util.Scanner;
public class Billing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double discount = 0;

        System.out.println("Welcome to XYZ Pvt. Ltd.");
        System.out.println("Items Available: momo   cake    chowmine\n");
        System.out.print("Please enter the number of items: ");
        int itemCount = sc.nextInt();
        String[] itemNames = new String[itemCount];
        int[] itemQuantities = new int[itemCount];
        double[] itemPrices = new double[itemCount];
        double[] itemAmounts = new double[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter item name: ");
            itemNames[i] = sc.next();

            System.out.print("Enter quantity for " + itemNames[i] + ": ");
            itemQuantities[i] = sc.nextInt();

            if ("momo".equals(itemNames[i])) {
                itemPrices[i] = 200;
            } else if ("cake".equals(itemNames[i])) {
                itemPrices[i] = 500;
            } else if ("chowmine".equals(itemNames[i])) {
                itemPrices[i] = 150;
            } else {
                System.out.println("Item not found: " + itemNames[i]);
                itemPrices[i] = 0.0;
            }

            itemAmounts[i] = itemPrices[i] * itemQuantities[i];
            total += itemAmounts[i];
        }

        System.out.print("Do you have a membership? (yes/no): ");
        String membership = sc.next();

        if (membership.equals("yes")) {
            discount = total * 0.1;
            total -= discount;
            System.out.println("10% Membership Discount Applied\n");
        }

        System.out.println("Item\tQuantity\tRate\tAmount\n");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemNames[i] + "\t" + itemQuantities[i] + "\t" + itemPrices[i] + "\t" + itemAmounts[i]+"\n");
        }
        System.out.println("\nDiscount = " + discount);
        System.out.println("\nTotal Amount = " + total);
    }
}