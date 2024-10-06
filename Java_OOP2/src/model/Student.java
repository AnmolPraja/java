package model;
import java.util.ArrayList;
import java.util.List;

public class Student {
   String name;

    public Student(String name, int roll_no, List<Subjects> selected_subject) {
        this.name = name;
        this.roll_no = roll_no;
        this.selected_subject = selected_subject;
    }

    public void Result(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll no: " + this.roll_no);

        float total_marks = 0;

        for(Subjects s: selected_subject){
            total_marks += s.getObtained_marks();
        }

        System.out.println("Obtained marks: " + total_marks);
        float percentage = (total_marks/350) * 100;
        System.out.println("Percentage: " + percentage);
    }
    public String getName() {
         return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public List<Subjects> getSelected_subject() {
        return selected_subject;
    }

    public void setSelected_subject(List<Subjects> selected_subject) {
        this.selected_subject = selected_subject;
    }

    int roll_no;
    List<Subjects> selected_subject = new ArrayList<>();
}
