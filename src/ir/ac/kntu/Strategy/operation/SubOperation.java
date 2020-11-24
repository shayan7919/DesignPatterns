package ir.ac.kntu.Strategy.operation;

public class SubOperation implements OperationStrategy {
    @Override
    public double doOperation(double first, double second) {
        return first - second;
    }
}
