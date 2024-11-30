package number_8;

public class Main {
    public static void main(String[] args) {
        Settings settings = new Settings();
        SettingsManager manager = new SettingsManager();

        settings.setSetting("theme", "dark");
        settings.setSetting("language", "ru");
        System.out.println("Текущие настройки:");
        settings.printSettings();

        manager.save(settings);

        settings.setSetting("theme", "light");
        settings.setSetting("fontSize", "14");
        System.out.println("\nИзменённые настройки:");
        settings.printSettings();

        manager.undo(settings);
        System.out.println("\nНастройки после восстановления:");
        settings.printSettings();
    }
}
