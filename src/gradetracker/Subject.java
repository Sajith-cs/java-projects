package gradetracker;

public class Subject {
    private String name;
    private double grade;
    public Subject(String n,double g) {
        this.name = n;
        this.grade=g;
    }
    public String getName(){
        return name;
    }
    public double getGrade(){
        return grade;
    }
}
