package strategies;

public class BlackFridayDiscount implements DiscountStrategy {

    @Override
    public double calculate(double value) {
        return value * 0.8;
    }
}
