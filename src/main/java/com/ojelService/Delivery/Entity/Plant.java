package com.ojelService.Delivery.Entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.ojelService.Delivery.Views;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
 //Uses InheritanceType.JOINED to store shared fields in 'plant' and unique fields
// in subclass tables
@Inheritance(strategy = InheritanceType.JOINED)
public class Plant {
        @Id
        @GeneratedValue
        private Long id;



        @JsonView(Views.Public.class)
        @Nationalized // should use @Nationalized instead of @Type=nstring
        private String name;

        @JsonView(Views.Public.class)
        @Column(precision=12, scale=4)
        private BigDecimal price; // BigDecimal is the standard Java class for currency math


//        retrieve delivery if itz needed
        @ManyToOne (fetch = FetchType.LAZY)
        @JoinColumn(name = "delivery_id")  //map the join column in the plant table
        private Delivery delivery;

}
