package uz.pdp.appwerhouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   @ManyToOne
    private Product product;

   @Column(nullable = false)
   private Double amount;

   private Double price;

   private Date expireDate;

   @ManyToOne
   private Input input;
}
