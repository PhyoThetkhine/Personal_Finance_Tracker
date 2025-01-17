package com.pft_system.Personal_Finance_Tracker.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name",nullable = false,length = 50)
    private String name;

    @Column(name="status",nullable = false)
    private int status;

    @PrePersist
    public void onCreate(){
        if(status == 0){
            status = 1;
        }
    }
}
