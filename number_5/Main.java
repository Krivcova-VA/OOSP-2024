package number_5;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Product product = new Product("Laptop", 1000.00);

        product.registerObserver(user1);
        product.registerObserver(user2);

        System.out.println("Changing the price of " + product.getName() + "...");
        product.setPrice(950.00);

        User user3 = new User("Charlie");
        product.registerObserver(user3);

        System.out.println("\nChanging the price again...");
        product.setPrice(900.00);
    }
}
