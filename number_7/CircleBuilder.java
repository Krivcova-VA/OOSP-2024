package number_7;

// Строитель для круга
public class CircleBuilder implements GraphicObjectBuilder {
    private int x, y;
    private String color;
    private int radius;

    public CircleBuilder(int radius) {
        this.radius = radius;
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
        Circle circle = new Circle(radius);
        circle.setPosition(x, y);
        circle.setColor(color);
        return circle;
    }
}

