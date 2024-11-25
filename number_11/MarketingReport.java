package number_11;

// Конкретный класс отчета: Маркетинговый отчет
public class MarketingReport extends Report {
    public MarketingReport(String title, String content) {
        super(title, content);
    }

    @Override
    public void display() {
        System.out.println("Маркетинговый отчет:");
        System.out.println("Заголовок: " + getTitle());
        System.out.println("Содержание: " + getContent());
    }
}
