package lista02.ex03.app;

import lista02.ex03.share.Product;
import lista02.ex03.share.Sale;

public class Main {
    public static void main(String[] args) {
        int amount = 3;
        double desconto = 3;
        Product product = new Product(30,"maça");

        Sale sale = new Sale(amount,product,desconto);
        sale.CalculeFinalPrice();

    }
}
