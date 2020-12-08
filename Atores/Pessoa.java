package Atores;

import java.util.Objects;

public abstract class Pessoa {
    protected String nome;
    protected int matricula;

    public Pessoa() {
    }

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Pessoa nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa matricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && matricula == pessoa.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            "}";
    }

}
