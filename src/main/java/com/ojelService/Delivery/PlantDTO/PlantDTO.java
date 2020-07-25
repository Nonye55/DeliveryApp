package com.ojelService.Delivery.PlantDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlantDTO {

    private String name;
    private BigDecimal price;

}

