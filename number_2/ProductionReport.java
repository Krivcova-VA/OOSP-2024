package number_2;

public class ProductionReport implements Report {
    @Override
    public void generateHeader() {
        System.out.println("Generating Production Report Header");
    }

    @Override
    public void generateTable() {
        System.out.println("Generating Production Report Table");
    }

    @Override
    public void generateChart() {
        System.out.println("Generating Production Report Chart");
    }
}

