package Task1;

import java.util.List;

public class Student {
    public String FIO;
    public String groops;
    public  int course;
    public List<Integer> evaluations;

    public Student(String FIO, String groops, int course, List<Integer> evaluations){
    this.FIO = FIO;
    this.groops = groops;
    this.course = course;
    this.evaluations = evaluations;
    }

    public String toString(){
        return FIO + " " + groops + " " + course + " " + evaluations;
    }

    public double avgEvaluations(){
        int sum = 0;
        for(int i = 0; i < evaluations.size(); i++){
            sum += evaluations.get(i);
        }
        return (double) sum/evaluations.size();
    }


}
