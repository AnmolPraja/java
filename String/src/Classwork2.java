import java.util.Scanner; //Wap to print only consonant from string
public class Classwork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String a = sc.next();

        a = a.toUpperCase();
        int l = a.length();

        for(int i = 0; i<l; i++){
            char x = a.charAt(i);

            if (x == 'A' | x == 'E' | x == 'I' | x == 'O' | x == 'U' ){
               continue;
            } else {
                System.out.println(x);
            }
        }
    }
}
