package number_10;

// Фасад для управления библиотекой
public class LibraryFacade {
    private final BookCatalog catalog = new BookCatalog();
    private final OrderSystem orderSystem = new OrderSystem();
    private final InternationalBookService internationalService = new InternationalBookService();

    // Поиск книги
    public void searchBook(String title) {
        if (catalog.findBook(title)) {
            System.out.println("Книга \"" + title + "\" найдена в каталоге.");
        } else {
            System.out.println("Книга \"" + title + "\" не найдена.");
        }
    }

    // Проверка наличия книги
    public void checkAvailability(String title) {
        if (catalog.isAvailable(title)) {
            System.out.println("Книга \"" + title + "\" доступна.");
        } else {
            System.out.println("Книга \"" + title + "\" недоступна.");
        }
    }

    // Оформление заказа на книгу
    public void orderBook(String title) {
        if (catalog.isAvailable(title)) {
            orderSystem.placeOrder(title);
        } else {
            System.out.println("Книга \"" + title + "\" недоступна для заказа.");
        }
    }

    // Проверка международной книги по ISBN
    public void checkInternationalBook(String isbn) {
        if (internationalService.checkInternationalBook(isbn)) {
            System.out.println("Книга с ISBN \"" + isbn + "\" является международной.");
        } else {
            System.out.println("Книга с ISBN \"" + isbn + "\" не является международной.");
        }
    }
}
