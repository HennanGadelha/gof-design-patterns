import strategies.DiscountStrategy;

public class DiscountCalculator {
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double aplicarDesconto(double value) {
        return strategy.calculate(value);
    }
}
