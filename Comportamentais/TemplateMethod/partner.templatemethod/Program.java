package partner.templatemethod;

import java.math.BigDecimal;

public class Program {

    public static void main(String[] args) {

        Gateway gateway = new Gateway();

        CreditCard creditCard = new CreditCard(new BigDecimal("200.00"), gateway);
        Pix pix = new Pix(new BigDecimal("500.00"), gateway);

        pix.pay();
        creditCard.pay();

    }

}
