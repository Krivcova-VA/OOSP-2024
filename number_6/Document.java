package number_6;

public abstract class Document {

    public final void createDocument() {
        openDocument();
        editDocument();
        saveDocument();
    }

    protected abstract void openDocument();
    protected abstract void editDocument();
    protected abstract void saveDocument();
}
