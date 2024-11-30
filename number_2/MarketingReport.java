package number_2;

public class MarketingReport implements Report {
    @Override
    public void generateHeader() {
        System.out.println("Generating Marketing Report Header");
    }
    @Override
    public void generateHeaderExel() {
        System.out.println("Generating Marketing Report Header in Exel");
    }

    @Override
    public void generateTable() {
        System.out.println("Generating Marketing Report Table");
    }

    @Override
    public void generateChart() {
        System.out.println("Generating Marketing Report Chart");
    }
}

