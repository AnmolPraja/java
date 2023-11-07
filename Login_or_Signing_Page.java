import java.util.Objects;
import java.util.Scanner;
public class Login_or_Signing_Page {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Signup page");
        System.out.println("What would you like your Username to be:");
        String s_username = sc.next();
        System.out.println("Password must contain '@' and be longer than 8 character");
        System.out.println("Enter your password:");
        String s_pass = sc.next();

        if (s_pass.contains("@") & s_pass.length()>8){
            System.out.println("Signup successful");
        } else {
            System.out.println("You did not meet the requirement to make the password");
        }

        System.out.println("Login Page");
        System.out.println("Enter your username:");
        String username = sc.next();

        if (username.equals(s_username)){
            System.out.println("Enter your password");
            String pass = sc.next();

            if(pass.equals(s_pass)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Incorrect Username");
        }
    }
}
