package polimofismo.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(){
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date manufactureDate() {
        return manufactureDate;
    }

    public UsedProduct setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }
    @Override
    public final String priceTag(){
        return getName()+ " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + dateFormat.format(manufactureDate) + ")";
    }
}
