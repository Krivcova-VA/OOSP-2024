package number_11;

public class FinancialReport extends Report {
    public FinancialReport(String title, String content) {
        super(title, content);
    }

    @Override
    public void display() {
        System.out.println("Финансовый отчет:");
        System.out.println("Заголовок: " + getTitle());
        System.out.println("Содержание: " + getContent());
    }
}
