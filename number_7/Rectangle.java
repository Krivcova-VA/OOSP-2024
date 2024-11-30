package number_7;

public class Rectangle extends GraphicObject {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") with width " + width + ", height " + height + " and color " + color);
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

