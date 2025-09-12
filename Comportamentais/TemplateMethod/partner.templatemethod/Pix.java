package partner.templatemethod;

import java.math.BigDecimal;

public class Pix extends Payment {

    public Pix(BigDecimal amount, Gateway gateway) {
        super(amount, gateway);
    }

    @Override
    BigDecimal discountCalculate() {
        if (this.getAmount().compareTo(new BigDecimal("400.00")) > 0) {
            return getAmount().multiply(new BigDecimal("0.2"));
        }
        return BigDecimal.ZERO;
    }
}
