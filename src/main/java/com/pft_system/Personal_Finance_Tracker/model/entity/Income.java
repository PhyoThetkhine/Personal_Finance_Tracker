package com.pft_system.Personal_Finance_Tracker.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "status", length = 1, nullable = false)
    private int status;
    @Column(name = ("amount"), nullable = false)
    private int amount;

    @ManyToOne
    @JoinColumn(name = "income_resource_id",nullable = false)
    private IncomeResource incomeResource;

    @ManyToOne
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;

    @PrePersist
    public void onCreate(){
        if(status == 0){
            status = 1;
        }

    }
}
