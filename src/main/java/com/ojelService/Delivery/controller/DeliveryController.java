package com.ojelService.Delivery.controller;

import com.ojelService.Delivery.Entity.Delivery;
import com.ojelService.Delivery.projection.RecipientAndPrice;
import com.ojelService.Delivery.repositry.DeliveryRepository;
import com.ojelService.Delivery.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

@PostMapping
    public Long scheduleDekivery(@RequestBody Delivery delivery){
    return deliveryService.save(delivery);
    }


    @GetMapping("/bill/{deliveryId}")
    public RecipientAndPrice getBill(@PathVariable Long deliveryId) {
        return deliveryService.getBill(deliveryId);
    }
}




