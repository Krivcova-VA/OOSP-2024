package number_2;

public class ReportApplication {
    private Report report;

    public void generateReport(String reportType) {
        ReportFactory factory;

        switch (reportType.toLowerCase()) {
            case "finance":
                factory = new FinancialReportFactory();
                break;
            case "marketing":
                factory = new MarketingReportFactory();
                break;
            case "production":
                factory = new ProductionReportFactory();
                break;
            default:
                System.out.println("Unknown report type");
                return;
        }

        report = factory.createReport();
        report.generateHeader();
        report.generateTable();
        report.generateChart();
    }

    public static void main(String[] args) {
        ReportApplication application = new ReportApplication();

        // Генерируем финансовый отчет
        application.generateReport("finance");

        // Генерируем маркетинговый отчет
        application.generateReport("marketing");

        // Генерируем производственный отчет
        application.generateReport("production");
    }
}

