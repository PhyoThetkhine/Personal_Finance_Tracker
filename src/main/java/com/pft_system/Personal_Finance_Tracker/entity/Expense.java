package com.pft_system.Personal_Finance_Tracker.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "status",nullable = false)
    private int status;

    @ManyToOne
    @JoinColumn(name = "expense_category_id",nullable = false)
    private ExpenseCategory expenseCategory;

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
