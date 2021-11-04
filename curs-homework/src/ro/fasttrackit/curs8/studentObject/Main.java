package ro.fasttrackit.curs8.studentObject;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Maria Popovici", 8);
        Student student2 = new Student("Laura Popopescu", 10);
        Student student3 = new Student("Dragos Axinte", 9);
        Student student4 = new Student("Ada Milea", 10);
        Student student5 = new Student("Ciprian Popovici", -10);

        System.out.println(student5.getGrade());

        System.out.println(Student.COUNT);
        System.out.println("The grades average is: " + Student.getGradeAverage());
    }
}
