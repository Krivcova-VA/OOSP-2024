package number_3;

public class GraphDatabase implements DBImplementation {
    @Override
    public void executeQuery(String query) {
        System.out.println("Executing Graph query: " + query);
    }
}
