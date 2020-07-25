package com.ojelService.Delivery.Entity;

import javax.persistence.Entity;

@Entity
public class Order {
    private Integer id;
    private Integer CustomerId;

    public Order(Integer id, Integer customerId) {
        this.id = id;
        CustomerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }
}
