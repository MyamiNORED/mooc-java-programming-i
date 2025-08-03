
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    
    
    
    
    
    
    
    public double averageOfPoints(){
        int total = this.examPoints.size();
        double sum = 0 ;
        for(int point : examPoints){
            sum += point;
        }
        if(total == 0){
            return -1;
        }
        return (sum * 1.0) / total ;
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    public double averageOfGrades(){
        int sum = 0 ;
        double total = grades.size() ;
        if(total == 0 ){
            return -1 ;
        }
        for(int x : grades ){
            sum += x;
        }
        return (sum * 1.0) /total ;
    }
    
    
    
    
    

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints =  new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
