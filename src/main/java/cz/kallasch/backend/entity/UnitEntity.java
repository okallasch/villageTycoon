package cz.kallasch.backend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="unit")
public class UnitEntity extends AbstractEntity {

    private String name;
    private String nation;
    private int attack;
    private int defenceInfantry;
    private int defenceCavalry;
    private int carryingCapacity;
    private int speed;
    private int consumption;
    private int woodCost;
    private int clayCost;
    private int ironCost;


}
