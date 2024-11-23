package number_6;

// Конкретный класс для графических документов
public class GraphicDocument extends Document {

    @Override
    protected void openDocument() {
        System.out.println("Opening graphic document...");
    }

    @Override
    protected void editDocument() {
        System.out.println("Editing graphic document...");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving graphic document...");
    }
}

