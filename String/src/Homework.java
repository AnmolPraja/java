import java.util.Scanner; //Reverse a string
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "Hello";
        int l = a.length();
        String rs = " ";

        for (int i = l - 1; i >= 0; i--) {
            char r = a.charAt(i);
            rs += r;
        }
        System.out.println(rs);
    }
}