package uz.pdp.appwerhouse.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appwerhousedemo.entity.template.AbstractEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbstractEntity {

}
