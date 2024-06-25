package entites;

public class Student {
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public  String name;

    public Student() {
    }

    public Student(double firstGrade, double secondGrade, double thirdGrade, String name) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
        this.name = name;
    }

    public Student(String name, double firstGrade, double secondGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.name = name;
    }
    public double average(double firstGrade, double secondGrade, double thirdGrade){
        return (firstGrade + secondGrade + thirdGrade) / 3;
    }
    public double average(double firstGrade, double secondGrade){
        return (firstGrade + secondGrade) / 2;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public String getName() {
        return name;
    }


}
