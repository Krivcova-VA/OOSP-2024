package number_7;

public class LineBuilder implements GraphicObjectBuilder {
    private int x, y;
    private String color;
    private int length;

    public LineBuilder(int length) {
        this.length = length;
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
        Line line = new Line(length);
        line.setPosition(x, y);
        line.setColor(color);
        return line;
    }
}

