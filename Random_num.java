import java.util.Random;
import java.util.Scanner;

public class Random_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int limit = 10;
        int int_random = ran.nextInt(limit);
        boolean guess = false;
        while (!guess) {

            System.out.println("Enter Your Guess.The range 0-9");
            int guess_num = sc.nextInt();
            if (int_random == guess_num) {
                System.out.println("The number is correct");
                break;
            }
            else {
                System.out.println("Incorrect");
            }
            System.out.println("To stop playing type \"quit\"");
            String escape = sc.next();
            if (escape.equals("quit")) {
                break;
            }
        }
    }
}