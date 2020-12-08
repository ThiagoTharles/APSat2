package Atores;

import java.util.Objects;

public class Cliente extends Pessoa {
    private String endereço;
    private int idade;
    private char sexo;

    public Cliente() {
    }

    public Cliente(String nome, int matricula, String endereço, int idade, char sexo) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereço = endereço;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Cliente endereço(String endereço) {
        this.endereço = endereço;
        return this;
    }

    public Cliente idade(int idade) {
        this.idade = idade;
        return this;
    }

    public Cliente sexo(char sexo) {
        this.sexo = sexo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(endereço, cliente.endereço) && idade == cliente.idade && sexo == cliente.sexo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(endereço, idade, sexo);
    }

    @Override
    public String toString() {
        return "{" +
            " endereço='" + getEndereço() + "'" +
            ", idade='" + getIdade() + "'" +
            ", sexo='" + getSexo() + "'" +
            "}";
    }

}
