package ir.ac.kntu.AbstractFactory.Shape;

public interface Factory {
    Shape getShape(Type type);
}
enum Type{
    RECTANGLE,SQUARE,CIRCLE;
}