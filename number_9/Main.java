package number_9;

public class Main {
    public static void main(String[] args) {
        WindowManager manager = WindowManager.getInstance();

        Window mainWindow = new Window("Главное окно");
        Window settingsWindow = new Window("Окно настроек");
        Window helpWindow = new Window("Окно помощи");

        manager.addWindow("main", mainWindow);
        manager.addWindow("settings", settingsWindow);
        manager.addWindow("help", helpWindow);

        manager.setActiveWindow("main");

        Window active = manager.getActiveWindow();
        if (active != null) {
            active.render();
        }

        System.out.println("\nВсе окна:");
        manager.renderAllWindows();

        manager.removeWindow("settings");

        manager.setActiveWindow("settings");

        System.out.println("\nОставшиеся окна:");
        manager.renderAllWindows();
    }
}
