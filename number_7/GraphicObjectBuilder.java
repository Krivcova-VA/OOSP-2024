package number_7;

// Интерфейс строителя графических объектов
public interface GraphicObjectBuilder {
    void setPosition(int x, int y);
    void setColor(String color);
    GraphicObject build();
}

