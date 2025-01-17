package com.pft_system.Personal_Finance_Tracker.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "income_resource")
public class IncomeResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", nullable = false,length = 45)
    private String name;
    @Column(name = "status", length = 1)
    private int status;

    @PrePersist
    public void onCreate(){
        if(status == 0){
            status = 1;
        }
    }
}
