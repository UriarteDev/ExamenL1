package com.cibertec.Profesores.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//ESTRUCTURAS
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private int Age;
    private int DNI;
}
