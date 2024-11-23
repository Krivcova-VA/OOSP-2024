package number_6;

public class Main {
    public static void main(String[] args) {
        // Создаем документы разных типов
        Document textDoc = new TextDocument();
        Document graphicDoc = new GraphicDocument();
        Document spreadsheetDoc = new SpreadsheetDocument();

        // Используем общий шаблонный метод createDocument для создания, редактирования и сохранения документов
        System.out.println("Processing Text Document:");
        textDoc.createDocument();

        System.out.println("\nProcessing Graphic Document:");
        graphicDoc.createDocument();

        System.out.println("\nProcessing Spreadsheet Document:");
        spreadsheetDoc.createDocument();
    }
}
