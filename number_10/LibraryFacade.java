package number_10;

public class LibraryFacade {
    private final BookCatalog catalog = new BookCatalog();
    private final OrderSystem orderSystem = new OrderSystem();
    private final InternationalBookService internationalService = new InternationalBookService();

    public void searchBook(String title) {
        if ((title == "") | (title == null)) {
            System.out.println("Введите корректное название книги.");
        } else {
            if (catalog.findBook(title)) {
                System.out.println("Книга \"" + title + "\" найдена в каталоге.");
            } else {
                System.out.println("Книга \"" + title + "\" не найдена.");
            }
        }
    }

    public void checkAvailability(String title) {
        if (catalog.isAvailable(title)) {
            System.out.println("Книга \"" + title + "\" доступна.");
        } else {
            System.out.println("Книга \"" + title + "\" недоступна.");
        }
    }

    public void orderBook(String title) {
        if ((title == "") | (title == null)) {
            System.out.println("Введите корректное название книги.");
        } else {
            if (catalog.isAvailable(title)) {
                orderSystem.placeOrder(title);
            } else {
                System.out.println("Книга \"" + title + "\" недоступна для заказа.");
            }
        }
    }

    public void checkInternationalBook(String isbn) {
        if (internationalService.checkInternationalBook(isbn)) {
            System.out.println("Книга с ISBN \"" + isbn + "\" является международной.");
        } else {
            System.out.println("Книга с ISBN \"" + isbn + "\" не является международной.");
        }
    }
}
