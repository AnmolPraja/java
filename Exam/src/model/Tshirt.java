package model;

import java.util.Arrays;

public class Tshirt {
    String name;
    String product_code;
    int price;
    String brand;
    String description;
    String[] size;

    public Tshirt(String name, String product_code, int price, String brand, String description, String[] size) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.size = size;
    }

    public void describe(){
        System.out.println("Item Name: " + this.name + "\n\nDescription: " + this.description + "\nProduct code: " + this.product_code + "\n\nPrice: " + this.price + "\nBrand Name: " + this.brand  + "\nAvailable Sizes: " + Arrays.toString(this.size) + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }
}
