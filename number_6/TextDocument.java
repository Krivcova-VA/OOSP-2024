package number_6;

// Конкретный класс для текстовых документов
public class TextDocument extends Document {

    @Override
    protected void openDocument() {
        System.out.println("Opening text document...");
    }

    @Override
    protected void editDocument() {
        System.out.println("Editing text document...");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving text document...");
    }
}
