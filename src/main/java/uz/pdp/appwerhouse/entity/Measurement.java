package uz.pdp.appwerhouse.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appwerhouse.entity.template.AbstractEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Measurement extends AbstractEntity {
}
