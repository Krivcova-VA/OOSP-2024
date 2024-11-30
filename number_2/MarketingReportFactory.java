package number_2;

public class MarketingReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        System.out.println("Creating Marketing Report");
        return new MarketingReport();
    }
}

