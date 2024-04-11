package br.cesul.lista02.ex03.share;

public class Sale {


    private  SaleItem saleItem;

    private final double discountPer;

    private double salePrice;

    public double getSalePrice() {
        return salePrice;
    }

    public Sale(SaleItem saleItem, double discountPer) {
        this.saleItem = saleItem;
        this.discountPer = discountPer;
    }

    public void CalculeFinalPrice(){
        salePrice = saleItem.getTotal() * ((1 - (discountPer /100))) ;
        System.out.println("O PREÇO FINAL É " + salePrice + " do total de " + saleItem.getNome());
    }


}
