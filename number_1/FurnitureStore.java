package number_1;

public class FurnitureStore {
    public static void main(String[] args) {
        FurnitureFactory chairFactory = new ChairFactory();
        FurnitureFactory tableFactory = new TableFactory();
        FurnitureFactory wardrobeFactory = new WardrobeFactory();

        Furniture chair = chairFactory.createFurniture();
        Furniture table = tableFactory.createFurniture();
        Furniture wardrobe = wardrobeFactory.createFurniture();

        chair.create();
        table.create();
        wardrobe.create();
    }
}


