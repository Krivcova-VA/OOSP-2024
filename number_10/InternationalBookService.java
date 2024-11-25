package number_10;

 // Подсистема для проверки международных книг
public class InternationalBookService {
    public boolean checkInternationalBook(String isbn) {
        // Имитация проверки международной книги
        return isbn.startsWith("978") || isbn.startsWith("979");
    }
}
