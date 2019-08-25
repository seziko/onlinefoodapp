package com.bilgeadam.onlinefoodapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "EMP_ID")
    private Long emppId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    public Employee() {
    }

    public Employee(Long emppId, String name, String surname) {
        this.emppId = emppId;
        this.name = name;
        this.surname = surname;
    }

    public Long getEmppId() {
        return emppId;
    }

    public void setEmppId(Long emppId) {
        this.emppId = emppId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
