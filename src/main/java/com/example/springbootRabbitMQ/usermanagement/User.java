package com.example.springbootRabbitMQ.usermanagement;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Integer token;
}