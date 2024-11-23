package number_1;
//фабрика для стула
public class ChairFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
