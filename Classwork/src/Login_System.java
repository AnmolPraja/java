import java.util.Objects;
import java.util.Scanner;
public class Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stored_id = 10;
        String stored_pass = "Anmol";

        System.out.println("To Login. Please enter the following information:");
        System.out.println("Enter your id: ");
        int id = sc.nextInt();
        System.out.println("Enter your password: ");
        String pass = sc.next();

        if (id == stored_id && Objects.equals(pass, stored_pass)){
            System.out.println("Logged in successfully.");
        } else {
            System.out.println("Please try again.");
        }
    }
}
