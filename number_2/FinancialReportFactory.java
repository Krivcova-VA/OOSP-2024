package number_2;

public class FinancialReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        System.out.println("Creating Financial Report");
        return new FinancialReport();
    }
}

