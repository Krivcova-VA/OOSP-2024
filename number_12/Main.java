package number_12;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("document.txt");
        File file2 = new File("photo.jpg");
        File file3 = new File("video.mp4");

        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Pictures");
        Folder folder3 = new Folder("Videos");

        Folder rootFolder = new Folder("Root");

        folder1.addComponent(file1);
        folder2.addComponent(file2);
        folder3.addComponent(file3);

        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);
        rootFolder.addComponent(folder3);

        rootFolder.display("");
    }
}
