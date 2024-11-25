package number_9;

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр менеджера окон
        WindowManager manager = WindowManager.getInstance();

        // Создаем окна
        Window mainWindow = new Window("Главное окно");
        Window settingsWindow = new Window("Окно настроек");
        Window helpWindow = new Window("Окно помощи");

        // Добавляем окна в менеджер
        manager.addWindow("main", mainWindow);
        manager.addWindow("settings", settingsWindow);
        manager.addWindow("help", helpWindow);

        // Устанавливаем активное окно
        manager.setActiveWindow("main");

        // Отображаем активное окно
        Window active = manager.getActiveWindow();
        if (active != null) {
            active.render();
        }

        // Отображаем все окна
        System.out.println("\nВсе окна:");
        manager.renderAllWindows();

        // Удаляем окно настроек
        manager.removeWindow("settings");

        // Пытаемся установить удалённое окно как активное
        manager.setActiveWindow("settings");

        // Отображаем оставшиеся окна
        System.out.println("\nОставшиеся окна:");
        manager.renderAllWindows();
    }
}
