package model;

import java.util.Arrays;

public class Order {
    // Fields
    private String name;
    private String phone_number;
    private int[] items;
    private int[] price;

    public Order(String name, String phone_number, int[] items, int[] price) {
        this.name = name;
        this.phone_number = phone_number;
        this.items = items;
        this.price = price;
    }

    public void Bill(){
        System.out.println("Order Details: " + "\nName: " + this.name + "\nPhone number: " + this.phone_number + "\n\nItems: " + Arrays.toString(this.items) + "\nPrice: " + Arrays.toString(this.price) + "\n");

        int total = Arrays.stream(price).sum();
        int vat = total * 13/100 ;
        int Final_total = total + vat;
        System.out.println("\nBill:" + "\nTotal Amount: Rs" + total + "\nVAT (13%): Rs" + vat + "\nTotal Amount with VAT: Rs" + Final_total + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }
}
