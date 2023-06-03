package uz.pdp.appwerhouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appwerhouse.entity.template.AbstractEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Category extends AbstractEntity {

    @ManyToOne
    private Category parentCategory;
}
