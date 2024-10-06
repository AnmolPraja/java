package model;
import java.util.List;
public class Order {
    String name;
    String contact;
    List<Tshirt> TshirtList1;

    public Order(String name, String contact, List<Tshirt> tshirtList1) {
        this.name = name;
        this.contact = contact;
        TshirtList1 = tshirtList1;
    }

    public void displayBill(int discountPercent){
        System.out.println("----- Customer Invoice -----");
        System.out.println("Item Code \t \t \t \t \t Price");
        int total=0;
        for(Tshirt i: this.TshirtList1){
            System.out.println(i.getProduct_code()+"\t \t \t \t \t"+i.getPrice());
            total += i.getPrice();
        }
        System.out.println("\n");
        System.out.println("\t \t \t \t \t Total: "+total);
        float discountAmount = total*((float) discountPercent /100);
        float totalAfterDiscount = total - discountAmount;
        float vatAmount;
        System.out.println("\t \t \t \t \t Discount Amount: "+discountAmount);

        vatAmount = totalAfterDiscount*0.13f;
        System.out.println("\t \t \t \t \t VAT Amount: "+vatAmount);
        float amountDue = totalAfterDiscount+vatAmount;
        System.out.println("\t \t \t \t \t Amount Due:  "+amountDue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Tshirt> getTshirtList1() {
        return TshirtList1;
    }

    public void setTshirtList1(List<Tshirt> tshirtList1) {
        TshirtList1 = tshirtList1;
    }
}
