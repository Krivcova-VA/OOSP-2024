package number_6;

// Абстрактный класс для документов
public abstract class Document {

    // Шаблонный метод, который определяет алгоритм
    public final void createDocument() {
        openDocument();
        editDocument();
        saveDocument();
    }

    // Шаги, которые будут реализовываться в подклассах
    protected abstract void openDocument();
    protected abstract void editDocument();
    protected abstract void saveDocument();
}
