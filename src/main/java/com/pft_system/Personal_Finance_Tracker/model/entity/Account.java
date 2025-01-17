package com.pft_system.Personal_Finance_Tracker.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", nullable = false,length = 45)
    private String name;
    @Column(name = "status", nullable = false,length = 1)
    private int status;
    @Column(name = "current_balance", nullable = false)
    private int current_balance;
    @Column(name = "liability", nullable = false)
    private int liability;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id",nullable = false)
    private Group group;

    @PrePersist
    public void onCreate(){
        if(status == 0){
            status = 1;
        }
    }

}
