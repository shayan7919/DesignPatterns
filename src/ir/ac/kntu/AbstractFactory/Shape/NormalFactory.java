package ir.ac.kntu.AbstractFactory.Shape;

public class NormalFactory implements Factory {
    @Override
    public Shape getShape(Type type) {
        switch (type) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case CIRCLE:
                return new Circle();
            default:
                return null;
        }
    }
}
