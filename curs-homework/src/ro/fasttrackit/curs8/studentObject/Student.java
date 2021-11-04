package ro.fasttrackit.curs8.studentObject;

public class Student {
    static int COUNT = 0;
    static double SUM = 0;
    private String name;
    private double grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = Math.abs(grade)>10 ? 10: Math.abs(grade);
        COUNT++;
        SUM += Math.abs(grade);
    }

    public String getName(){
        return name;
    }
    public double getGrade() {
        return grade;
    }

    public static double getGradeAverage() {
        return SUM/COUNT;
    }
}
