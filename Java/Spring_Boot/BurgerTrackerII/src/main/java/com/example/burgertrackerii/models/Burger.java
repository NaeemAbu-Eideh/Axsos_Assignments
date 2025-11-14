package com.example.burgertrackerii.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = ErrorMessages.NOTNULL)
    private String burgerName;

    @NotNull(message = ErrorMessages.NOTNULL)
    private String restName;

    @NotNull(message = ErrorMessages.NOTNULL)
    @Min(value = 0, message = ErrorMessages.RANGE)
    @Max(value = 5, message = ErrorMessages.RANGE)
    private int rate;

    @NotNull(message = ErrorMessages.NOTNULL)
    private String note;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    public Burger() {}
    public Burger(String burgerName, String restName, int rate, String note) {
        this.burgerName = burgerName;
        this.restName = restName;
        this.rate = rate;
        this.note = note;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getRestName() {
        return restName;
    }

    public int getRate() {
        return rate;
    }

    public String getNote() {
        return note;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}
