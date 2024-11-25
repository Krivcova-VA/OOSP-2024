package number_12;

// Главный класс для демонстрации
public class Main {
    public static void main(String[] args) {
        // Создание файлов
        File file1 = new File("document.txt");
        File file2 = new File("photo.jpg");
        File file3 = new File("video.mp4");

        // Создание папок
        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Pictures");
        Folder folder3 = new Folder("Videos");

        // Создание корневой папки
        Folder rootFolder = new Folder("Root");

        // Строим иерархию
        folder1.addComponent(file1); // Документы содержит файл
        folder2.addComponent(file2); // Картинки содержит файл
        folder3.addComponent(file3); // Видео содержит файл

        rootFolder.addComponent(folder1); // Корень содержит папки
        rootFolder.addComponent(folder2);
        rootFolder.addComponent(folder3);

        // Отображение структуры
        rootFolder.display("");
    }
}
