package ir.ac.kntu.Factory.Shape;

public class ShapeFactory {
    public Shape getShape(Shapes shapes) {
        switch (shapes) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }

    public enum Shapes {
        SQUARE, CIRCLE, RECTANGLE
    }
}
