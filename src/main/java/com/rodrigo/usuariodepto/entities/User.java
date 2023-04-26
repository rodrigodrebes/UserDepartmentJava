package com.rodrigo.usuariodepto.entities;
import jakarta.persistence.*;

//Configuração da Entidade e Configuração da Tabela Relacional
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    //Configuração da chave estrangeira
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Construtor
    public User(){

    }

    // Getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    //Setters

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
