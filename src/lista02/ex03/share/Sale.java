package lista02.ex03.share;

public class Sale {

    private int amountProducts;

    private Product product;

    private double discountPer;

    private double salePrice;

    public double getSalePrice() {
        return salePrice;
    }

    public Sale(int amountProducts, Product product, double discountPer) {
        this.amountProducts = amountProducts;
        this.product = product;
        this.discountPer = discountPer;
    }

    public void CalculeFinalPrice(){
        salePrice = amountProducts * (product.getPriceUnite()) * ((1 - (discountPer /100))) ;
        System.out.println("O PREÇO FINAL É " + salePrice + " do total de " + product.getName());
    }


}
