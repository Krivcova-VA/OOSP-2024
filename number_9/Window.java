package number_9;

public class Window {
    private final String name;

    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void render() {
        System.out.println("Отображение окна: " + name);
    }
}