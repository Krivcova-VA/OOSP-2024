package number_3;

public class NoSQLDatabase implements DBImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing NoSQL query: " + query);
    }
}
