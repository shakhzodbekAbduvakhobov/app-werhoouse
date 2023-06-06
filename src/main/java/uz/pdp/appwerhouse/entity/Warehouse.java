package uz.pdp.appwerhouse.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appwerhouse.entity.template.AbstractEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbstractEntity {
}
