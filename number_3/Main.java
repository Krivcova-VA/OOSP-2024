package number_3;

public class Main {
    public static void main(String[] args) {

        DBImplementation sqlDB = new SQLDatabase();
        DBImplementation noSQLDB = new NoSQLDatabase();
        DBImplementation graphDB = new GraphDatabase();

        Database clientDatabase = new ClientDatabase(sqlDB);
        Database productDatabase = new ProductDatabase(noSQLDB);
        Database orderDatabase = new OrderDatabase(graphDB);

        clientDatabase.query("SELECT * FROM clients WHERE id = 1");
        productDatabase.query("FIND products WHERE category = 'electronics'");
        orderDatabase.query("MATCH (order)-[:CONTAINS]->(product) WHERE order.id = 100");
    }
}

