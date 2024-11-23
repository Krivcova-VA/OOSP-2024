package number_5;

// Класс пользователя (наблюдатель)
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String product, double price) {
        System.out.println("Hello, " + name + "! The price of " + product + " has changed to " + price);
    }
}
