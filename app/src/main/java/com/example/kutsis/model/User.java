package com.example.kutsis.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Long id;
    private String email;
    private String name;
    private String surName;
    private Date registerDate;
    private Boolean reserve;
    private String kutuphaneKey;
    private String kutuphaneName;
    private Long masaId;
    private Date lastReserveDate;

    public void setLastReserveDate(Date lastReserveDate) {
        this.lastReserveDate = lastReserveDate;
    }

    public Date getLastReserveDate() {
        return lastReserveDate;
    }

    public User () {

    }

    public void setReserve(Boolean reserve) {
        this.reserve = reserve;
    }

    public Boolean getReserve() {
        return reserve;
    }

    public String getKutuphaneKey() {
        return kutuphaneKey;
    }

    public void setKutuphaneKey(String kutuphaneKey) {
        this.kutuphaneKey = kutuphaneKey;
    }

    public String getKutuphaneName() {
        return kutuphaneName;
    }

    public void setKutuphaneName(String kutuphaneName) {
        this.kutuphaneName = kutuphaneName;
    }

    public Long getMasaId() {
        return masaId;
    }

    public void setMasaId(Long masaId) {
        this.masaId = masaId;
    }

    public User (String email, String name, String surName) {
        id = (long) (Math.random()*100000);
        registerDate = new Date();
        this.email = email;
        this.name = name;
        this.surName = surName;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

}
