package model;

import java.io.Serializable;

public class Evento implements Serializable {
    private Long id;
    private String nome;

    public Evento() {

    }

    public Evento(Long id, String nome) {
        this.id=id;
        this.nome = nome;
    }

    public Long getId(){
        return this.id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
