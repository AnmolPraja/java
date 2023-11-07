public class String_functions {
    public static void main(String[] args) {
        String name = "Why are you running?";
        System.out.println(name.toLowerCase()); //Turns all the characters to lowercase in the string
        System.out.println(name.toUpperCase()); //Turns all the characters to uppercase in the string
        System.out.println(name.equals("Why are you running?")); //Checks if the String is equal to another String or statement and returns Boolean value
        System.out.println(name.equalsIgnoreCase("Knock knock")); // Compares this String to another String ignoring case considerations
        System.out.println(name.charAt(10)); //Returns the char value at the specified index.
        System.out.println(name.indexOf(2)); //Returns the index within this string of the first occurrence of the specified character.
        System.out.println(name.contains("Hello")); //Checks if the given String contains the word or not and returns a Boolean value
        System.out.println(name.length()); // Returns the amont of character present on the string

    }
}
