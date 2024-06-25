package entites;

import javax.xml.namespace.QName;
import java.util.List;

public class Employee {
    private String name;
    private Integer id;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
       salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return "List of Employee: %n" +
                id +
                ", " + name +
                ", " + salary +
                '}';
    }
}
