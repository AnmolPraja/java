public class Sum {
    public static void main(String[] args) {
        int num[]= {1,1,1,2,2};

        int num1 = 0;

        for(int i = 0; i<5 ; i++){

            num1 += num[i];
        }
        System.out.println(num1);

    }
}