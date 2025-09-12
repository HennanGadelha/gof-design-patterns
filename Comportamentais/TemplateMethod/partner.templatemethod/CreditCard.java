package partner.templatemethod;

import java.math.BigDecimal;

public class CreditCard extends Payment {

    public CreditCard(BigDecimal amount, Gateway gateway) {
        super(amount, gateway);
    }

    public BigDecimal feeCalculate() {

        return this.getAmount().multiply(new BigDecimal("0.3"));
    }

    @Override
    BigDecimal discountCalculate() {

        if (this.getAmount().compareTo(new BigDecimal("300.00")) > 0) {
            return this.getAmount().multiply(new BigDecimal("0.2"));
        }
        return BigDecimal.ZERO;
    }

}
