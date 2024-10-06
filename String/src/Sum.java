public class Sum {
    public static void main(String[] args) {
        String g_num = "11122";

        int l = g_num.length();

        //int num = Integer.parseInt(g_num);
        String num1 = "";

        for(int i = 0; i<l; i++){
            char a = g_num.charAt(i);
            num1 += a;
            int num = Integer.parseInt(num1);
            num += num1;

        }

    }
}