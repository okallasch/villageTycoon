package cz.kallasch.backend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="users")
public class UserEntity extends AbstractEntity{

    private String Name;

}
