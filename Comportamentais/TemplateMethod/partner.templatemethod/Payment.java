package partner.templatemethod;

import java.math.BigDecimal;

public abstract class Payment {

    private BigDecimal amount;
    private Gateway gateway;

    public Payment(BigDecimal amount, Gateway gateway) {
        this.amount = amount;
        this.gateway = gateway;
    }

    public BigDecimal feeCalculate(){
        return new BigDecimal("0.00");
    }

    abstract BigDecimal discountCalculate();

    // this is template method.
    // because here we will be using methods
    // that will still be implemented by subclasses or overridden
    public void pay() {
        BigDecimal finalAmount = getAmount().add(this.feeCalculate()).subtract(this.discountCalculate());
        gateway.pay(finalAmount);
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
