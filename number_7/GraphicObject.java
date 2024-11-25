package number_7;

// Абстрактный класс для графического объекта
public abstract class GraphicObject {
    protected int x, y;
    protected String color;

    public abstract void draw();
    public abstract void resize(int width, int height);

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

