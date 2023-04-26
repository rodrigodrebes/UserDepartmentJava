package com.rodrigo.usuariodepto.entities;

import jakarta.persistence.*;

//Configuração da Entidade e Configuração da Tabela Relacional
@Entity
@Table(name = "tb_department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Construtor
    public Department(){

    }

    // Getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    // Setters
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }


}
