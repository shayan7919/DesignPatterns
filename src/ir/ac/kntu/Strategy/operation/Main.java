package ir.ac.kntu.Strategy.operation;

import static ir.ac.kntu.Strategy.operation.StrategyFactory.Type.*;

public class Main {
    public static void main(String[] args) {
        StrategyFactory factory = new StrategyFactory();
        Context context = new Context(factory.getFactory(SUB));
        context.doOperation(5, 4);
        context = new Context(factory.getFactory(ADD));
        context.doOperation(5, 4);
        context = new Context(factory.getFactory(MUL));
        context.doOperation(4, 5);
    }
}
