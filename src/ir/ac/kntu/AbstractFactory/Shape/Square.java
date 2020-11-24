package ir.ac.kntu.AbstractFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square without color");
    }
}
