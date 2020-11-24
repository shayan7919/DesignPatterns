package ir.ac.kntu.AbstractFactory.Shape;

import static ir.ac.kntu.AbstractFactory.Shape.FactoryProducer.Factories.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = FactoryProducer.getFactory(NORMAL);

        Shape shape = factory.getShape(Type.CIRCLE);
        Shape secondShape = factory.getShape(Type.RECTANGLE);
        Shape thirdShape = factory.getShape(Type.SQUARE);

        shape.draw();
        secondShape.draw();
        thirdShape.draw();

        factory = FactoryProducer.getFactory(COLOR);
        shape = factory.getShape(Type.CIRCLE);
        secondShape = factory.getShape(Type.RECTANGLE);
        thirdShape = factory.getShape(Type.SQUARE);

        shape.draw();
        secondShape.draw();
        thirdShape.draw();

    }

}
