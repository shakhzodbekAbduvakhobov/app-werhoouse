package uz.pdp.appwerhouse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appwerhousedemo.entity.template.AbstractEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends AbstractEntity {

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment photo;

    private String code;

    @ManyToOne(optional = false)
    private Measurement measurement;
}
