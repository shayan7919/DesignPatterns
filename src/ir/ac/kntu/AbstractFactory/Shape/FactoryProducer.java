package ir.ac.kntu.AbstractFactory.Shape;

public class FactoryProducer {
    public static Factory getFactory(Factories factories) {
        switch (factories) {
            case NORMAL:
                return new NormalFactory();
            case COLOR:
                return new ColorFactory();
            default:
                return null;
        }
    }


    enum Factories {
        COLOR, NORMAL
    }
}
