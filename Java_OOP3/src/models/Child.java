package models;
public class Child extends Father {
    String name;

    public Child(String name, String caste) {
        super(caste);
        this.name = name;
    }

    public void saySomething() {
        System.out.println("My name is " + this.name );
    }
}
