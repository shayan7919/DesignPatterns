package ir.ac.kntu.Factory.Shape;

import static ir.ac.kntu.Factory.Shape.ShapeFactory.Shapes.*;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape = factory.getShape(CIRCLE);
        shape.draw();

        Shape secondShape = factory.getShape(RECTANGLE);
        secondShape.draw();

        Shape thirdShape = factory.getShape(SQUARE);
        thirdShape.draw();

    }
}
