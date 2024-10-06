import models.Child;
import models.Father;
import models.GrandFather;

public class Main {
    public static void main(String[] args) {
        GrandFather grandfatherObj = new GrandFather();
        Father fatherObj = new Father("Newar");
        Child childObj = new Child("Ram","Newar");

        childObj.sayHello();
        childObj.saySomething();
    }
}
