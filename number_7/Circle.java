package number_7;

// Класс для графического объекта "Круг"
public class Circle extends GraphicObject {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius + " and color " + color);
    }

    @Override
    public void resize(int width, int height) {
        this.radius = width / 2;  // Предположим, что ширина = диаметру
    }
}

