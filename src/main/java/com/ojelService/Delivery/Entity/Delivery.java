package com.ojelService.Delivery.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


@NamedQuery(name ="Delivery.findVyName",
            query =  "select d from Delivry d where d.name = :name")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    @Column(name = "address_full", length = 500)
    private String address;
    private LocalDateTime deliveryTime; // includes both date and time - simpler than having two separate fields
    @Type(type = "yes_no")
    private Boolean completed;
// make sure to specify mappedBy. Lazy fetch optional,
    //  but often a good idea for collection attributes
// added CascadeType.REMOVE to automatically clear any associated plants when removed
@OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
private List<Plant> plants;
}



