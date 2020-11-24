package ir.ac.kntu.AbstractFactory.Shape;

public class ColorFactory implements Factory {
    @Override
    public Shape getShape(Type type) {
        switch (type) {
            case RECTANGLE:
                return new RectangleC();
            case SQUARE:
                return new SquareC();
            case CIRCLE:
                return new CircleC();
            default:
                return null;
        }
    }
}
