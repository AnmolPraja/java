
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String OrignalString = sc.next();

        OrignalString = OrignalString.toUpperCase();
        int l = OrignalString.length();

        String ReversedString = "";

        for(int i = l - 1; i >= 0; i--){
          char v = OrignalString.charAt(i);
          ReversedString += v;
        }

        if( OrignalString.equalsIgnoreCase(ReversedString)){
            System.out.println("The String is a palindrome.");
        } else {
            System.out.println("The String is not a palindrome.");
        }
    }
}
