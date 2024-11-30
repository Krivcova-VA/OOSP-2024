package number_3;

public class OrderDatabase extends Database {
    public OrderDatabase(DBImplementation implementation) {
        super(implementation);
    }
    @Override
    public void query(String query) {
        System.out.println("Order Database Operation: ");
        implementation.executeQuery(query);
    }
}

