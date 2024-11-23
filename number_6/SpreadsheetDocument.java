package number_6;

// Конкретный класс для табличных документов
public class SpreadsheetDocument extends Document {

    @Override
    protected void openDocument() {
        System.out.println("Opening spreadsheet document...");
    }

    @Override
    protected void editDocument() {
        System.out.println("Editing spreadsheet document...");
    }

    @Override
    protected void saveDocument() {
        System.out.println("Saving spreadsheet document...");
    }
}

