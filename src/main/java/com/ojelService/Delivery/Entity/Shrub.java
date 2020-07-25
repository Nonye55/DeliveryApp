package com.ojelService.Delivery.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shrub  extends  Plant{

    private int heightCm;
    private int widthCm;

}
