package com.ojelService.Delivery.Entity;

import javax.persistence.Entity;

@Entity
public class Customer {
    private Integer id;
    private String userName;
    private String passsword;

    public Customer(Integer id, String userName, String passsword) {
        this.id = id;
        this.userName = userName;
        this.passsword = passsword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
}
