package cz.kallasch.backend.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="building")
public class BuildingEntity extends AbstractEntity{

    private String name;
    private String description;
    private String type;
    private int woodCost;
    private int clayCost;
    private int ironCost;
    private int cropCost;

}

