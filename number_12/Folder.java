package number_12;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Папка: " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }
}
