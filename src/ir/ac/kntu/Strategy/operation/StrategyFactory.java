package ir.ac.kntu.Strategy.operation;

public class StrategyFactory {
    public OperationStrategy getFactory(Type type) {
        switch (type) {
            case SUB:
                return new SubOperation();
            case ADD:
                return new AddOperation();
            case MUL:
                return new MulOperation();
            default:
                return null;
        }
    }

    public enum Type {
        SUB, ADD, MUL
    }
}
