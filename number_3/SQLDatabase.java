package number_3;

public class SQLDatabase implements DBImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing SQL query: " + query);
    }
}




