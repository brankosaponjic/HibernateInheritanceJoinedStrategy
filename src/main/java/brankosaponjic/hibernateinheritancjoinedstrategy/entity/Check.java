package brankosaponjic.hibernateinheritancjoinedstrategy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bankcheck")
@PrimaryKeyJoinColumn(name = "id")
public class Check extends Payment{

    @Column(name = "check_number")
    private String checkNumber;
}