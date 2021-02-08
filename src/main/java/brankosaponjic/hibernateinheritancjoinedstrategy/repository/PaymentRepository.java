package brankosaponjic.hibernateinheritancjoinedstrategy.repository;

import brankosaponjic.hibernateinheritancjoinedstrategy.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
