package number_2;

public class FinancialReport implements Report {
    @Override
    public void generateHeader() {
        System.out.println("Generating Financial Report Header");
    }
    @Override
    public void generateHeaderExel() {
        System.out.println("Generating Financial Report Header in Exel");
    }

    @Override
    public void generateTable() {
        System.out.println("Generating Financial Report Table");
    }

    @Override
    public void generateChart() {
        System.out.println("Generating Financial Report Chart");
    }
}

