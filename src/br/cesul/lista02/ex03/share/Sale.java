package br.cesul.lista02.ex03.share;

import br.cesul.lista03.ex02.share.Vote;

import java.util.ArrayList;
import java.util.List;

public class Sale {



    private List<SaleItem> arraySaleItem = new ArrayList<>();
    private final double discountPer;

    private double salePrice;

    public double getSalePrice() {
        return salePrice;
    }

    public Sale(SaleItem saleItem, double discountPer) {
        this.arraySaleItem.add(saleItem);
        this.discountPer = discountPer;
    }

    public void CalculeFinalPrice(){
        int totalPrice = 0;
        for (SaleItem saleItem: arraySaleItem){
            totalPrice += saleItem.getTotal();
        }
        System.out.println("Final price in your Buy is " + totalPrice* ((1 - (discountPer /100))) );
    }


}
