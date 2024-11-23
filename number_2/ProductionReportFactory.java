package number_2;

public class ProductionReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        System.out.println("Creating Production Report");
        return new ProductionReport();
    }
}

