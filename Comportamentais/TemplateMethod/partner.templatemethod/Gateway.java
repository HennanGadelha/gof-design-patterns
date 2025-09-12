package partner.templatemethod;

import java.math.BigDecimal;

public class Gateway {

    public void pay(BigDecimal amount){
        System.out.println("Payment sucesss: " + amount);
    }
}
