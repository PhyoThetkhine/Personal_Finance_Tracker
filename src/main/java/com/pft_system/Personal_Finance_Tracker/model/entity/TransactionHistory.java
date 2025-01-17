package com.pft_system.Personal_Finance_Tracker.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tranaction_history")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "status", length = 1, nullable = false)
    private int status;
    @ManyToOne
    @JoinColumn(name = "from_account_id",nullable = false)
    private Account fromAccount;

    @ManyToOne
    @JoinColumn(name = "to_account_id",nullable = false)
    private Account toAccount;

    @PrePersist
    public void onCreate(){
        if(status == 0){
            status = 1;
        }

    }


}
