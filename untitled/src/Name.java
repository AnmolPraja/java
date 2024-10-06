import java.util.Scanner;
public class Name {
    public static void main (String[] args){
        Scanner my_obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =  my_obj.next();

        System.out.println("Your name is " + name + ".");
    }
}
