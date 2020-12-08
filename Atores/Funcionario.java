package Atores;

import java.util.Objects;

public class Funcionario extends Pessoa {
    protected String login, senha;

    public Funcionario() {
    }

    public Funcionario(String nome, int matricula, String login, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario login(String login) {
        this.login = login;
        return this;
    }

    public Funcionario senha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Funcionario)) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(login, funcionario.login) && Objects.equals(senha, funcionario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, senha);
    }

    @Override
    public String toString() {
        return "{" +
            " login='" + getLogin() + "'" +
            ", senha='" + getSenha() + "'" +
            "}";
    }

}
