package com.ojelService.Delivery.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="plant")
public class Flower  extends  Plant{
    private String color;


//    since flower is extending plant all the attribute of plants he has inherited.

//    @Id
//    @GeneratedValue
//    private Long id;

//    @Nationalized // should use @Nationalized instead of @Type=nstring
//    private String name;
//    @Column(precision=12, scale=4)
//    private BigDecimal price; // BigDecimal is the standard Java class for currency math

}
