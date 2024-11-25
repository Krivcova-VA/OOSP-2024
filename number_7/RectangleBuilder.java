package number_7;

// Строитель для прямоугольника
public class RectangleBuilder implements GraphicObjectBuilder {
    private int x, y;
    private String color;
    private int width, height;

    public RectangleBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public GraphicObject build() {
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.setPosition(x, y);
        rectangle.setColor(color);
        return rectangle;
    }
}
