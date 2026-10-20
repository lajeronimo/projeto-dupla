package br.com.senai.infob.backend.projeto_dupla.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;

@Entity 
@Table(name="curso")
public class Curso {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="data_inicio")
    private LocalDate dataInicio;

    @Column(name="data_termino")
    private LocalDate dataTermino;

    @ManyToMany
    @JoinTable(
        name="curso_usuario",
        joinColumns=@JoinColumn(name="curso_id", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="usuario_id", referencedColumnName="id")
    )

    public Curso() {
    }

    public Curso(<any> dataInicio, Date dataTermino, <any> descricao, <any> id, <any> nome) {
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.descricao = descricao;
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

    public <any> getDescricao() {
        return descricao;
    }

    public void setDescricao(<any> descricao) {
        this.descricao = descricao;
    }

    public <any> getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(<any> dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

}
