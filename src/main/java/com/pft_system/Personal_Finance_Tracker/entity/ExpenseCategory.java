package com.pft_system.Personal_Finance_Tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "expense_category")
public class ExpenseCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", nullable = false)
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
