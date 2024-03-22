package lista02.ex03.share;

public class Product {


    public Product(double priceUnite, String name) {
        this.priceUnite = priceUnite;
        this.name = name;
    }

    private  String name;
    private double priceUnite;

    public double getPriceUnite() {
        return priceUnite;
    }

    public String getName() {
        return name;
    }
}
