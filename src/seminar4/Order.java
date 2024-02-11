package seminar4;

import seminar4.exceptions.ExceptionBuyer;
import seminar4.exceptions.ExceptionProduct;

public class Order {
    public Buyer buyer;
    public Product product;
    public String amount;

    public Order(Buyer buyer, Product product, String amount) {
        this.buyer = buyer;
        this.product = product;
        this.amount = amount;
    }
    public Order(){

    }

    public static Order getOrder(String buyerName, String productName, String amount, Buyer[] buyers, Product[] products) {
        Buyer buyer = null;
        Product product = null;
        for (Buyer b : buyers) {
            if (b.getName().equals(buyerName)) {
                buyer = b;
            }
        }
        for (Product p : products) {
            if (p.getName().equals(productName)) {
                product = p;
            }
        }

        if (buyer == null) {
            throw new ExceptionBuyer();
        } else if (product == null) {
            throw new ExceptionProduct();
        } else {
            return new Order(buyer, product, amount);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", amount='" + amount + '\'' +
                '}';
    }
}
