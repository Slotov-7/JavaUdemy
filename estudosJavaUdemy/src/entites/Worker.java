package entites;

import entites.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    //associacoes
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament() {
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : contracts){
            calendar.setTime(contract.getDate());
            int contract_year = calendar.get(Calendar.YEAR);
            int contract_month = 1 + calendar.get(Calendar.MONTH);
            if(year == contract_year && month == contract_month){
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
