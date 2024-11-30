package number_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Settings {
    private Map<String, String> settings = new HashMap<>();

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.getOrDefault(key, "Значение не найдено");
    }

    public void removeSetting(String key) {
        settings.remove(key);
    }

    public void printSettings() {
        if (settings.isEmpty()) {
            System.out.println("Настройки пусты.");
        } else {
            settings.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }

    public Map<String, String> getState() {
        return new HashMap<>(settings);
    }

    public void setState(Map<String, String> state) {
        this.settings = state;
    }
}



