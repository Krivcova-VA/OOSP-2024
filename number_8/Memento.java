package number_8;

import java.util.Map;

// Класс снимка (Memento)
public class Memento {
    private final Map<String, String> state;

    public Memento(Map<String, String> state) {
        this.state = state;
    }

    public Map<String, String> getState() {
        return state;
    }
}
