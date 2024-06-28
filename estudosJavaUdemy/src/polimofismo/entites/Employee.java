package polimofismo.entites;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hours;
    private Double valeuPerHours;
    public Employee(){
    }

    public Employee(String name, Integer hours, Double valeuPerHours) {
        this.name = name;
        this.hours = hours;
        this.valeuPerHours = valeuPerHours;
    }

    public String name() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Integer hours() {
        return hours;
    }

    public Employee setHours(Integer hours) {
        this.hours = hours;
        return this;
    }

    public Double valeuPerHours() {
        return valeuPerHours;
    }

    public Employee setValeuPerHours(Double valeuPerHours) {
        this.valeuPerHours = valeuPerHours;
        return this;
    }
    public double payment(){
        return hours * valeuPerHours;
    }

}
