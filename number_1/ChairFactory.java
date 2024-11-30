package number_1;

public class ChairFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
