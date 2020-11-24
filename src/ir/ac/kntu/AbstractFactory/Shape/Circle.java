package ir.ac.kntu.AbstractFactory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle without color");
    }
}
