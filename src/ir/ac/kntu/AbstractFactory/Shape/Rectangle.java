package ir.ac.kntu.AbstractFactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle without color");
    }
}
