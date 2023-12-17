package model;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private int[] marks;
    private char grade;

    // Constructor
    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculate_grade();
        calculate_percentage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        calculate_grade();
    }

    public char getGrade() {
        return grade;
    }

    private void calculate_grade() {
        int totalMarks = Arrays.stream(marks).sum();
        double averageMarks = totalMarks / (double) marks.length;

        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public int calculate_percentage() {
        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        return(totalMarks/5);
    }

    // Method to display results
    public void displayResult() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Marks: " + Arrays.toString(getMarks()));
        System.out.println("Grade: " + getGrade());
        System.out.println("Percentage: " + calculate_percentage() + "%");
        System.out.println("\n");
    }

}