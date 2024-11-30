package number_3;

public class ClientDatabase extends Database {

    public ClientDatabase(DBImplementation implementation) {
        super(implementation);
    }

    @Override
    public void query(String query) {
        System.out.println("Client Database Operation: ");
        implementation.executeQuery(query);
    }
}

