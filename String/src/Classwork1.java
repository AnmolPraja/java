import java.util.Scanner;
public class Classwork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String x =sc.next();

        x = x.toUpperCase();
        int l = x.length();
        int i;

        for(i=0; i<l ; i++){

            System.out.println( i + 1 + "."  + x.charAt(i));
        }

    }
}
