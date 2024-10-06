import model.Student;
import model.Subjects;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subjects sub1 = new Subjects("Math",40,100,60);
        Subjects sub2 = new Subjects("Physics",40,100,70);
        Subjects sub3 = new Subjects("Chem",40,100,50);

        List<Subjects> subjectsList1 = new ArrayList<>();
        subjectsList1.add(sub1);
        subjectsList1.add(sub2);
        subjectsList1.add(sub3);

        Student stu1 = new Student("Anmol", 24059, subjectsList1);

        stu1.Result();
    }
}
