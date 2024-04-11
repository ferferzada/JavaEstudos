package br.cesul.lista02.ex03.share;

public class SaleItem {
    private Product product;

    private int amount;

    public SaleItem(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public double getTotal(){
        return product.getPriceUnite() * amount;
    }
    public String getNome(){
        return product.getName();
    }

}
