package gradetracker;

public class Main {
    public static void main(String[] args){
        GradeTracker obj=new GradeTracker();
        Subject s1=new Subject("Mathematik",2.7);
        obj.addSubject(s1);
        Subject s2=new Subject("Automaten",1.3);
        obj.addSubject(s2);
        Subject s3=new Subject("FOOP",2.3);
        obj.addSubject(s3);
        System.out.println("Average : "+obj.getAverage());
        System.out.println("Highest Mark : "+obj.getBest().getName()+" - "+obj.getBest().getGrade());
        System.out.println("Bad Performance : "+obj.getWorst().getName()+" - "+obj.getWorst().getGrade());
    }
}
