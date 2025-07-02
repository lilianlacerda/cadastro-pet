package com.example.lilisolution.cadastro_pet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CadastroPet")
public class CadastroPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String especie;
    private String raca;
    private String idade;
    private String sexo;
    private String peso;
    private String dataNascimento;
    private String porte;
    private String cor;

    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEspecie() {
        return especie;
    }
    public String getRaca() {
        return raca;
    }
    public String getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public String getPeso() {
        return peso;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getPorte() {
        return porte;
    }
    public String getCor() {
        return cor;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}


