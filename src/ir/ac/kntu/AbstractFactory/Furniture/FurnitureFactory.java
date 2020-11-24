package ir.ac.kntu.AbstractFactory.Furniture;

public interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
