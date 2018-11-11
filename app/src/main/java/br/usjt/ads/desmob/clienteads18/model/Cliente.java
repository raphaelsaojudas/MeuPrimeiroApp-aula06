package br.usjt.ads.desmob.clienteads18.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private String nome, diretor, data, genero, sinopse, pop, bilheteria, elenco, figura;


    public Cliente() {

        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.data = data;
        this.genero = genero;
        this.sinopse = sinopse;
        this.pop = pop;
        this.bilheteria = bilheteria;
        this.elenco = elenco;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDiretor(){
        return diretor;}

    public void setDiretor(String diretor) {
        this.diretor = diretor;}

    public String getData(){
        return data;}

    public void setdata(String data) {
        this.data = data;}

    public String getGenero(){
        return genero;
    }

    void setGenero(String genero){
        this.genero = genero;
    }

    public String getPop(){
        return pop;
    }

    void setPop(String pop){
        this.pop = pop;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(String bilheteria) {
        this.bilheteria = bilheteria;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getFigura(){
        return this.figura;
    }

    public void setFigura(String figura){
        this.figura = figura;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", data='" + data + '\'' +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", pop='" + pop + '\'' +
                ", bilheteria='" + bilheteria + '\'' +
                ", elenco='" + elenco + '\'' +
                '}';
    }
}