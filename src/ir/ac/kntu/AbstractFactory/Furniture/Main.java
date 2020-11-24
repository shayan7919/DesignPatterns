package ir.ac.kntu.AbstractFactory.Furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFactory();
        Chair chair = furnitureFactory.createChair();
        System.out.println(chair);
    }
}
