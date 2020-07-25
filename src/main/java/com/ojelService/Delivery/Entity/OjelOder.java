package com.ojelService.Delivery.Entity;

import javax.persistence.Entity;

@Entity
public class OjelOder {
    
    private Integer orderId;
    private  String ojelName;
    private  Double ojelPrice;
    private Integer count;

    public OjelOder(Integer orderId, String ojelName, Double ojelPrice, Integer count) {
        this.orderId = orderId;
        this.ojelName = ojelName;
        this.ojelPrice = ojelPrice;
        this.count = count;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOjelName() {
        return ojelName;
    }

    public void setOjelName(String ojelName) {
        this.ojelName = ojelName;
    }

    public Double getOjelPrice() {
        return ojelPrice;
    }

    public void setOjelPrice(Double ojelPrice) {
        this.ojelPrice = ojelPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
