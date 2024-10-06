import java.util.Scanner;
public class Result_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for Maths: ");
        int m = sc.nextInt();
        System.out.println("Enter marks for Physics: ");
        int p = sc.nextInt();
        System.out.println("Enter marks for Chemistry: ");
        int c = sc.nextInt();

        double total = m + p +c;
        double percentage = (total/300) * 100 ;

        System.out.println("Obtained percentage is " + percentage);

        if (percentage<=100 & percentage>=80){
            System.out.println("Your GPA is A.");
        } else if (percentage<=80 & percentage>=60) {
            System.out.println("Your GPA is B.");
        } else if (percentage<=60 & percentage>=40) {
            System.out.println("Your GPA is C.");
        } else if (percentage<=40) {
            System.out.println("Your GPA is D.");
        }
    }
}
