package number_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Класс, представляющий настройки
public class Settings {
    private Map<String, String> settings = new HashMap<>();

    // Установить настройку
    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    // Получить настройку
    public String getSetting(String key) {
        return settings.getOrDefault(key, "Значение не найдено");
    }

    // Удалить настройку
    public void removeSetting(String key) {
        settings.remove(key);
    }

    // Печать всех настроек
    public void printSettings() {
        if (settings.isEmpty()) {
            System.out.println("Настройки пусты.");
        } else {
            settings.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }

    // Получить текущее состояние настроек
    public Map<String, String> getState() {
        return new HashMap<>(settings);
    }

    // Восстановить настройки из состояния
    public void setState(Map<String, String> state) {
        this.settings = state;
    }
}



