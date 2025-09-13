import strategies.BirthdayDiscount;
import strategies.BlackFridayDiscount;

public class Main {

    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        calculator.setStrategy(new BlackFridayDiscount());
        System.out.println("Black Friday Discount: " + calculator.aplicarDesconto(100.0));

        calculator.setStrategy(new BirthdayDiscount());
        System.out.println("Birthday Discount: " + calculator.aplicarDesconto(100.0));
    }
}
