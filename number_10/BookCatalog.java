package number_10;


import java.util.HashMap;
        import java.util.Map;

// Подсистема для управления каталогом книг
public class BookCatalog {
    private final Map<String, Boolean> books = new HashMap<>();

    public BookCatalog() {
        books.put("Java Programming", true);
        books.put("Design Patterns", true);
        books.put("Clean Code", false);
    }

    // Проверить наличие книги
    public boolean isAvailable(String title) {
        return books.getOrDefault(title, false);
    }

    // Найти книгу в каталоге
    public boolean findBook(String title) {
        return books.containsKey(title);
    }
}









