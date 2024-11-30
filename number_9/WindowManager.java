package number_9;
import java.util.HashMap;
import java.util.Map;

public class WindowManager {
    private static WindowManager instance;
    private final Map<String, Window> windows = new HashMap<>();
    private String activeWindow;

    private WindowManager() {}

    public static WindowManager getInstance() {
        if (instance == null) {
            instance = new WindowManager();
        }
        return instance;
    }

    public void addWindow(String key, Window window) {
        windows.put(key, window);
        System.out.println("Окно \"" + window.getName() + "\" добавлено.");
    }

    public void removeWindow(String key) {
        if (windows.containsKey(key)) {
            System.out.println("Окно \"" + windows.get(key).getName() + "\" удалено.");
            windows.remove(key);
            if (key.equals(activeWindow)) {
                activeWindow = null;
            }
        } else {
            System.out.println("Окно с ключом \"" + key + "\" не найдено.");
        }
    }

    public void setActiveWindow(String key) {
        if (windows.containsKey(key)) {
            activeWindow = key;
            System.out.println("Активное окно: " + windows.get(key).getName());
        } else {
            System.out.println("Окно с ключом \"" + key + "\" не найдено.");
        }
    }

    public Window getActiveWindow() {
        return activeWindow != null ? windows.get(activeWindow) : null;
    }

    public void renderAllWindows() {
        System.out.println("Список окон:");
        for (Window window : windows.values()) {
            window.render();
        }
    }
}
