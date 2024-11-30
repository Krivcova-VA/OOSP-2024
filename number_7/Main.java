package number_7;

public class Main {
    public static void main(String[] args) {

        GraphicObjectBuilder circleBuilder = new CircleBuilder(10);
        circleBuilder.setPosition(5, 5);
        circleBuilder.setColor("Red");
        GraphicObject circle = circleBuilder.build();
        circle.draw();

        GraphicObjectBuilder rectangleBuilder = new RectangleBuilder(20, 10);
        rectangleBuilder.setPosition(10, 20);
        rectangleBuilder.setColor("Blue");
        GraphicObject rectangle = rectangleBuilder.build();
        rectangle.draw();

        GraphicObjectBuilder lineBuilder = new LineBuilder(15);
        lineBuilder.setPosition(30, 40);
        lineBuilder.setColor("Green");
        GraphicObject line = lineBuilder.build();
        line.draw();
    }
}

