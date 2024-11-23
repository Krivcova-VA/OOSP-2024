package number_3;

// Реализация для графовой базы данных
// Реализация для SQL базы данных
public class SQLDatabase implements DBImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing SQL query: " + query);
    }
}
// Реализация для NoSQL базы данных
class NoSQLDatabase implements DBImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing NoSQL query: " + query);
    }
}
// Реализация для графовой базы данных
class GraphDatabase implements DBImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing Graph query: " + query);
    }
}



