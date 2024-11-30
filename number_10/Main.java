package number_10;

// Главный класс
public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();


        library.searchBook("Java Programming");
        library.searchBook("");
        library.checkAvailability("Java Programming");
        library.orderBook("Java Programming");
        library.orderBook(null);

        library.checkAvailability("Clean Code");
        library.orderBook("Clean Code");

        library.checkInternationalBook("9781234567890");
        library.checkInternationalBook("1234567890123");
    }
}
