package number_11;

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создаем прототипы
        FinancialReport financialPrototype = new FinancialReport("Годовой отчет", "Свод финансов за год.");
        MarketingReport marketingPrototype = new MarketingReport("Рекламные стратегии", "Стратегии продвижения на 2024 год.");

        // Регистрируем прототипы
        ReportRegistry registry = new ReportRegistry();
        registry.register("financial", financialPrototype);
        registry.register("marketing", marketingPrototype);

        // Клонируем отчеты и изменяем данные
        Report clonedFinancialReport = registry.getReport("financial");
        clonedFinancialReport.setContent("Обновленные данные по финансам за квартал.");
        clonedFinancialReport.display();

        System.out.println();

        Report clonedMarketingReport = registry.getReport("marketing");
        clonedMarketingReport.setTitle("Анализ конкурентов");
        clonedMarketingReport.setContent("Анализ сильных и слабых сторон конкурентов.");
        clonedMarketingReport.display();
    }
}