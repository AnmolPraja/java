package models;

public class Father{
    String caste;
    String property;

    public Father(String caste) {
        this.caste = caste;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    private void sayBye(){
        System.out.println("Bye");
    }
}
