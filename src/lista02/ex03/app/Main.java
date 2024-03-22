package lista02.ex03.app;

import lista02.ex03.share.Product;
import lista02.ex03.share.Sale;
import lista02.ex03.share.SaleItem;

public class Main {
    public static void main(String[] args) {
        int amount = 3;
        double desconto = 3;
        Product product = new Product(20,"maça");
        SaleItem saleItem = new SaleItem(product,3);

        Sale sale = new Sale(saleItem,desconto);
        sale.CalculeFinalPrice();

    }
}
