package number_10;

public class InternationalBookService {
    public boolean checkInternationalBook(String isbn) {
        return isbn.startsWith("978") || isbn.startsWith("979");
    }
}
