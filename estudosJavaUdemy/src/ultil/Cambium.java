package ultil;

public class Cambium {
    public static double cambium(double cotDolar, double quantityDolar){
        double withoutTaxTotal = cotDolar * quantityDolar;
        return withoutTaxTotal + (withoutTaxTotal * 0.06);
    }
}
