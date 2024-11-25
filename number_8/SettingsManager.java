package number_8;
import java.util.Stack;
// Класс для управления состояниями (Caretaker)
import java.util.Stack;

public class SettingsManager extends Settings {
    private final Stack<Memento> history = new Stack<>();

    // Сохранение состояния
    public void save(Settings settings) {
        history.push(new Memento(settings.getState()));
        System.out.println("Снимок настроек сохранён.");
    }

    // Восстановление состояния
    public void undo(Settings settings) {
        if (!history.isEmpty()) {
            settings.setState(history.pop().getState());
            System.out.println("Настройки восстановлены из снимка.");
        } else {
            System.out.println("Нет снимков для восстановления.");
        }
    }
}