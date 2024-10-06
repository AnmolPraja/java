import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Press the number for the following ");
        System.out.println("1 = addition");
        System.out.println("2 = subtraction");
        System.out.println("3 = multiplication");
        System.out.println("4 = division");

        System.out.println("Enter the number");
        int f = sc.nextInt();

        if (f == 1){
            int a = num1+num2;
            System.out.println("Sum = "+ a);
        } else if (f == 2) {
            int s = num1-num2;
            System.out.println("Sub = "+ s);
        } else if (f == 3) {
            int m = num1*num2;
            System.out.println("Multiple = "+ m);
        } else if (f == 4) {
            int d = num1/num2;
            System.out.println("Div = " + d);
        } else{
            System.out.println("Enter number from 1 to 4.");
        }
    }
}
