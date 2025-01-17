package com.pft_system.Personal_Finance_Tracker.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Column(name = "name", nullable = false,length = 45)
    private String name;

    @Column(name = "status", length = 1, nullable = false)
    private int status;

    @PrePersist
    public void onCreate(){
        if(status == 0){
            status = 1;
        }

    }
}
