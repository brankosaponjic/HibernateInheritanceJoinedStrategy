package brankosaponjic.hibernateinheritancjoinedstrategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {
    @Id
    private int id;
    private double amount;
}
