package brankosaponjic.hibernateinheritancjoinedstrategy;

import brankosaponjic.hibernateinheritancjoinedstrategy.entity.Check;
import brankosaponjic.hibernateinheritancjoinedstrategy.entity.CreditCard;
import brankosaponjic.hibernateinheritancjoinedstrategy.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateinheritancjoinedstrategyApplicationTests {

    @Autowired
    PaymentRepository paymentRepository;

    @Test
    void createPayment() {
        CreditCard cc = new CreditCard();
        cc.setId(121);
        cc.setAmount(1800);
        cc.setCardNumber("222888444");
        paymentRepository.save(cc);
    }

    @Test
    void createCheckPayment() {
        Check ch = new Check();
        ch.setId(122);
        ch.setAmount(1800);
        ch.setCheckNumber("222888444");
        paymentRepository.save(ch);
    }

}
