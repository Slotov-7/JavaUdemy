package entites;

public class Funcionario {
    public String name;
    public double gorssSalary;
    public double tax;

    public double netSalary(){
        return gorssSalary - tax;
    }
    public void increaseSalary(double percentage){
        gorssSalary += gorssSalary * (percentage / 100);
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}

