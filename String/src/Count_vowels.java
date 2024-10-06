import java.util.Scanner;
public class Count_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String x = sc.next();

        int l = x.length();
        x = x.toUpperCase();

        int v = 0;
        int c = 0;

        for (int i = 0; i < l; i++) {
            char a = x.charAt(i);

            if (a == 'A' | a == 'E' | a == 'I' | a == 'O' | a == 'U') {
                v++;
            } else {
                c++;
            }
        }

        System.out.println("The number of vowels are " + v);
        System.out.println("The number of consonants are " + c);
    }
}
