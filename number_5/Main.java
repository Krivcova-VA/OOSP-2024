package number_5;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько пользователей
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Создаем товар
        Product product = new Product("Laptop", 1000.00);

        // Подписываем пользователей на уведомления о товаре
        product.registerObserver(user1);
        product.registerObserver(user2);

        // Изменяем цену товара
        System.out.println("Changing the price of " + product.getName() + "...");
        product.setPrice(950.00);  // Уведомление будет отправлено всем подписанным пользователям

        // Добавляем еще одного пользователя
        User user3 = new User("Charlie");
        product.registerObserver(user3);

        // Меняем цену снова
        System.out.println("\nChanging the price again...");
        product.setPrice(900.00);  // Уведомление получат все подписчики
    }
}
