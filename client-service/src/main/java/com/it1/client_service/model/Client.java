package com.it1.client_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    private int id;
    private String email;
    private String phone;
}
