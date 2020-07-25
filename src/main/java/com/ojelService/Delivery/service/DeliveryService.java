package com.ojelService.Delivery.service;

import com.ojelService.Delivery.Entity.Delivery;
import com.ojelService.Delivery.projection.RecipientAndPrice;
import com.ojelService.Delivery.repositry.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService   {
    @Autowired
    DeliveryRepository deliveryRepository;

        public RecipientAndPrice getBill(Long deliveryId){
            return deliveryRepository.getBill(deliveryId);
        }
    public Long save(Delivery delivery) {
        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
        deliveryRepository.persist(delivery);
        return delivery.getId();
    }

}
