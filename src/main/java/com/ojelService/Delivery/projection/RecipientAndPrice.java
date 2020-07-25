package com.ojelService.Delivery.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipientAndPrice {
    private String recipientName;
    private BigDecimal price;

}
