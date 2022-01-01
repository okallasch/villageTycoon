package cz.kallasch.backend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="stockpile")
public class StockPileEntity extends AbstractEntity{

    private int wood;
    private int clay;
    private int iron;
    private int crop;
    @OneToOne
    private UserEntity userEntity;

}
