import java.sql.SQLOutput;

public class Non_Primitive_Datatypes {
    public static void main(String[] args) {
        String x = "Ramu";
        String y = "Shyam";

        System.out.println(x.charAt(1));    //Prints the character at the given index
        System.out.println(x.indexOf('R'));   //Prints the index of the given character
        System.out.println(x.equals(y));    //Prints weather the variable are equal or not by returning Boolean value
        System.out.println(x.length());     //Prints the length of the given String
        System.out.println(x.substring(0,3));   //Prints the index from a to b if (a,b)
        System.out.println(x.replace("R","S")); //Replaces the target value with the replacement value
        System.out.println(x.toLowerCase());    //Turns all the character in the variable to lower case
        System.out.println(x.toUpperCase());    //Turns all the character in the variables to upper case
    }
}
