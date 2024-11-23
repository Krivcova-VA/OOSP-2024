package number_3;

// Абстракция для работы с базой данных
public abstract class Database {
    protected DBImplementation implementation;

    // Конструктор принимает реализацию DBImplementation (именно через мост)
    public Database(DBImplementation implementation) {
        this.implementation = implementation;
    }

    // Основной метод для выполнения операции (например, запроса данных)
    public abstract void query(String query);
}

