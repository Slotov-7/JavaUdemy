package polimofismo.entites;

public class Outsourceemployee extends Employee {//tercerizado
    private Double additionalCharge;

    public Outsourceemployee(){
    }

    public Outsourceemployee(String name, Integer hours, Double valeuPerHours, Double additionalCharge) {
        super(name, hours, valeuPerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double additionalCharge() {
        return additionalCharge;
    }

    public Outsourceemployee setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
        return this;
    }

    @Override
    public final double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}

