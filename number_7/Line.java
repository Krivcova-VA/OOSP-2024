package number_7;

// Класс для графического объекта "Линия"
public class Line extends GraphicObject {
    private int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line at (" + x + ", " + y + ") with length " + length + " and color " + color);
    }

    @Override
    public void resize(int width, int height) {
        this.length = width;  // Предположим, что длина линии равна ширине
    }
}

