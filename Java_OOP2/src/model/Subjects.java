package model;

public class Subjects {
    String name;
    int pass_marks;
    int full_marks;
    int obtained_marks;

    public Subjects(String name, int pass_marks, int full_marks, int obtained_marks) {
        this.name = name;
        this.pass_marks = pass_marks;
        this.full_marks = full_marks;
        this.obtained_marks = obtained_marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPass_marks() {
        return pass_marks;
    }

    public void setPass_marks(int pass_marks) {
        this.pass_marks = pass_marks;
    }

    public int getFull_marks() {
        return full_marks;
    }

    public void setFull_marks(int full_marks) {
        this.full_marks = full_marks;
    }

    public int getObtained_marks() {
        return obtained_marks;
    }

    public void setObtained_marks(int obtained_marks) {
        this.obtained_marks = obtained_marks;
    }
}
