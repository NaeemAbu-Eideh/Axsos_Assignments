package com.example.dojosandninjas.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dojos")
public class Dojo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 255, message = DojoErrorMessages.DOJONAMEERROR)
    private String name;

    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
    private List<Ninja> ninjas;

    public void setNinjas(ArrayList<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public Dojo() {}
    public Dojo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setNinja(Ninja ninja) {
        this.ninjas.add(ninja);

    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


    public List<Ninja> getNinjas() {
        return ninjas;
    }

}
