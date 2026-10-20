package br.com.senai.infob.backend.projeto_dupla.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name="usuario")
public class Usuario {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id

    @Column(name="nome")
    private String nome
    
    @Column(name="cpf")
    private String cpf

    @ManyToOne 
    @JoinColumn(name="curso_id")
    private Curso curso;

    public Usuario() {
    }

    public Usuario(String cpf, <any> id, <any> nome) {
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
    }

    public <any> getId() {
        return id;
    }

    public void setId(<any> id) {
        this.id = id;
    }

    public <any> getNome() {
        return nome;
    }

    public void setNome(<any> nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
}

