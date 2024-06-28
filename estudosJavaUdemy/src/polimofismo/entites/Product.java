package polimofismo.entites;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }
    public String priceTag(){
        return name + " $ " + String.format("%.2f", getPrice());
    }
}
