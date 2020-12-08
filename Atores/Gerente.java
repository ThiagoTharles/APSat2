package Atores;

import Produtos.Produto;
import Repositorios.RepositorioPessoa;
import Repositorios.RepositorioProdutos;

public class Gerente extends Funcionario{

    public Gerente(String nome, int matricula, String login, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }

    public void addOperador(OperadorDeSistemas op, RepositorioPessoa rpe) {
        rpe.getPessoas().put(op.getMatricula(), op);
    }

    public void addCliente(Cliente c, RepositorioPessoa rpe) {
        rpe.getPessoas().put(c.getMatricula(), c);
    }

    public void addProduto(Produto p, RepositorioProdutos rpr) {
        rpr.getProdutos().put(p.getCodigo(), p);
    }

    public void listarProdutos(RepositorioProdutos rpr) {
        rpr.listar();
    }

    public void listarClientes(RepositorioPessoa rpe) {
        rpe.listarClientes();
    }

    public void listarOperadores(RepositorioPessoa rpe) {
        rpe.listarOperadores();
    }

    public Produto procurarProduto(String codigo, RepositorioProdutos rpr) {
        return rpr.getProdutos().get(codigo);
    }
    
    public Cliente procurarCliente(int matricula, RepositorioPessoa rpe) {
        return (Cliente) rpe.getPessoas().get(matricula);
    }

    public OperadorDeSistemas procurarOperador(int matricula, RepositorioPessoa rpe) {
        return (OperadorDeSistemas) rpe.getPessoas().get(matricula);
    }

    
}