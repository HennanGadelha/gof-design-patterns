package strategies;

public class BirthdayDiscount implements DiscountStrategy {
    @Override
    public double calculate(double value) {
        return value * 0.9;
    }
}
