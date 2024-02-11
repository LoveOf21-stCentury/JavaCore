package seminar4;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        Buyer[] buyers = {
                new Buyer("Nick", 56, "Card"),
                new Buyer("Jade", 43, "Card"),
                new Buyer("Sam", 23, "Cash")
        };

        Product[] products = {
                new Product("Bread", "3", 14.99),
                new Product("Pasta", "5", 49.99 ),
                new Product("Juice", "0", 23.99)
        };

        System.out.println(order.getOrder("Nick", "Pasta", "2", buyers, products));
        System.out.println(order.getOrder("Jade", "Bread", "3", buyers, products));
        System.out.println(order.getOrder("Sam", "Low", "1", buyers, products));
    }
}
