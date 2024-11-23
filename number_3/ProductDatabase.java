package number_3;

// Абстракция для работы с продуктами
public class ProductDatabase extends Database {

    public ProductDatabase(DBImplementation implementation) {
        super(implementation);
    }

    @Override
    public void query(String query) {
        System.out.println("Product Database Operation: ");
        implementation.executeQuery(query);
    }
}

