package uz.pdp.appwerhouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Client extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String phoneNumber;

}
