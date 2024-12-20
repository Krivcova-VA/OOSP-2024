package number_11;

abstract class Report implements Cloneable {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Report clone() {
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Ошибка при клонировании отчета.", e);
        }
    }

    public abstract void display();
}


