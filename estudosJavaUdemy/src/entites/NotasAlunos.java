package entites;

public class NotasAlunos {
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public String name;
    public double finalGrade(){
        return firstGrade + secondGrade + thirdGrade;
    }
    public double missingPoints(){
        return 60 - finalGrade();
    }
    public String toString(){
        if(finalGrade() >= 60){
            return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nPASS";
        }
        else{
            return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nFAILED" + "\nMISSED " + String.format("%.2f", missingPoints()) + " POINTS";
        }
    }
}
