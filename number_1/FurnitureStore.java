package number_1;

public class FurnitureStore {
    public static void main(String[] args) {
        // Создаем фабрики
        FurnitureFactory chairFactory = new ChairFactory();
        FurnitureFactory tableFactory = new TableFactory();
        FurnitureFactory wardrobeFactory = new WardrobeFactory();

        // Используем фабрики для создания мебели
        Furniture chair = chairFactory.createFurniture();
        Furniture table = tableFactory.createFurniture();
        Furniture wardrobe = wardrobeFactory.createFurniture();

        // Выводим результат
        chair.create();
        table.create();
        wardrobe.create();
    }
}


