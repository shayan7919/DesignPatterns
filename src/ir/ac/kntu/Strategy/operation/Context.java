package ir.ac.kntu.Strategy.operation;

public class Context {
    private OperationStrategy operation;

    public Context(OperationStrategy operation) {
        this.operation = operation;
    }

    public void doOperation(double first, double second) {
        System.out.println(operation.doOperation(first, second));
    }
}
