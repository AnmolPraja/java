import java.util.Scanner;
public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
         int num1=num%3;
         int num2=num%5;
         int num3=num1+num2;

        switch(num3){
            case(0):
                System.out.println("fizzbuzz");
                break;
            default:
                switch (num1){
                    case 0:
                        System.out.println("fizz");
                        break;
                    default:
                        switch(num2){
                            case 0:
                                System.out.println("buzz");
                                break;
                            default:
                                System.out.println("not fizzbuzz");
                                break;
                        }
                }

        }
    }
}
