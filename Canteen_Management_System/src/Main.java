import models.Customer;
import models.Item;
import models.ItemOrder;
import models.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Anmol", 1000);
        Item i1 = new Item("Burger", 100);
        Item i2 = new Item("Pizza", 70);

        ItemOrder itemOrder1 = new ItemOrder(i1,2);
        ItemOrder itemOrder2 = new ItemOrder(i2,1);

        List<ItemOrder> io1 = new ArrayList<>();
        io1.add(itemOrder1);
        io1.add(itemOrder2);

        List<ItemOrder> io2 = new ArrayList<>();
        io2.add(itemOrder1);

        Order order1 = new Order(1,io1);
        Order order2= new Order(2,io2);

        List<Order> c1order = new ArrayList<>();
        c1order.add(order1);
        c1order.add(order2);
        c1.setOrderList(c1order);

        System.out.println("Orders");

        for(Order order: c1.getOrderList()){
            System.out.println("OrderId: "+order.getOrderId());
            System.out.println("Name \t \t \t \t Quantity");
            for(ItemOrder itemOrder: order.getItemOrderList()){
                System.out.println(itemOrder.getItem().getName()+"\t \t \t \t"+itemOrder.getQuantity());

            }
        }
    }
}