package number_3;

public abstract class Database {
    protected DBImplementation implementation;

    public Database(DBImplementation implementation) {
        this.implementation = implementation;
    }

    public abstract void query(String query);
}

