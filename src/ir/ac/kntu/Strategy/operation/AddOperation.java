package ir.ac.kntu.Strategy.operation;

public class AddOperation implements OperationStrategy {
    @Override
    public double doOperation(double first, double second) {
        return first + second;
    }
}
