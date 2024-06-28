package polimofismo.entites;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public ImportedProduct setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
        return this;
    }
    public double totalPrice(){
        return getPrice() + customsFee;
    }
    @Override
    public final String priceTag(){
        return  getName() + " $ " + String.format("%.2f", totalPrice())
                + "(Customs fee: $ " + String.format("%.2f", getCustomsFee()) + ")" ;
    }
}
