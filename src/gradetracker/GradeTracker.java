package gradetracker;

import java.util.ArrayList;
import java.util.List;

public class GradeTracker {
    private List<Subject> subjects;
    public GradeTracker(){
        subjects=new ArrayList<>();
    }
    public void addSubject(Subject s){
        subjects.add(s);
    }
    public double getAverage(){
        if(subjects.isEmpty())
            return 0;
        double sum=0;
        for(Subject s:subjects){
            sum=sum+s.getGrade();
        }
        return (sum/subjects.size());
    }
    public Subject getBest(){
        if(subjects.isEmpty())
            return null;
        Subject best=subjects.get(0);
       for(int i=1;i< subjects.size();i++){
           if(best.getGrade()>subjects.get(i).getGrade())
               best= subjects.get(i);
       }
       return best;
    }
    public Subject getWorst(){
        if(subjects.isEmpty())
            return null;
        Subject worst=subjects.get(0);
        for(int i=1;i< subjects.size();i++){
            if(worst.getGrade()<subjects.get(i).getGrade())
                worst= subjects.get(i);
        }
        return worst;
    }
}
