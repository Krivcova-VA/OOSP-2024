package number_1;

public class WardrobeFactory extends FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Wardrobe();
    }
}