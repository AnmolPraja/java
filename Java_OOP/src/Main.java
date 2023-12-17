import model.Student;
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Anmol",16, new int[]{60, 70, 55, 60, 65},'A');
//        Student s2 = new Student("Simon",16, new int[]{60, 70, 55, 60, 65},'A');
//        Student s3 = new Student("Ram",16, new int[]{60, 70, 55, 60, 65},'A');

        int[] marks1 = {60, 70, 55, 60, 65};
        int[] marks2 = {90,80,60,60,80};
        int[] marks3 = {10,50,40,45,50};
        Student s1 = new Student("Anmol",16,marks1);
        Student s2 = new Student("Simon",16,marks2);
        Student s3 = new Student("Nomis",16,marks3);
        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
    }
}