package number_8;

public class Main {
    public static void main(String[] args) {
        Settings settings = new Settings();
        SettingsManager manager = new SettingsManager();

        // Установка начальных настроек
        settings.setSetting("theme", "dark");
        settings.setSetting("language", "ru");
        System.out.println("Текущие настройки:");
        settings.printSettings();

        // Сохранение состояния
        manager.save(settings);

        // Изменение настроек
        settings.setSetting("theme", "light");
        settings.setSetting("fontSize", "14");
        System.out.println("\nИзменённые настройки:");
        settings.printSettings();

        // Восстановление настроек
        manager.undo(settings);
        System.out.println("\nНастройки после восстановления:");
        settings.printSettings();
    }
}
