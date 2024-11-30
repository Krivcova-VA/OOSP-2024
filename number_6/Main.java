package number_6;

public class Main {
    public static void main(String[] args) {

        Document textDoc = new TextDocument();
        Document graphicDoc = new GraphicDocument();
        Document spreadsheetDoc = new SpreadsheetDocument();

        System.out.println("Processing Text Document:");
        textDoc.createDocument();

        System.out.println("\nProcessing Graphic Document:");
        graphicDoc.createDocument();

        System.out.println("\nProcessing Spreadsheet Document:");
        spreadsheetDoc.createDocument();
    }
}
