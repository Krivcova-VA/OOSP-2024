package number_7;

public interface GraphicObjectBuilder {
    void setPosition(int x, int y);
    void setColor(String color);
    GraphicObject build();
}

