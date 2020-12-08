package Atores;

import java.util.Calendar;
import java.util.Date;

import Produtos.Produto;
import Repositorios.Locacao;
import Repositorios.RepositorioLocacoes;
import Repositorios.RepositorioPessoa;
import Repositorios.RepositorioProdutos;

public class OperadorDeSistemas extends Funcionario {

    public OperadorDeSistemas(String nome, int matricula, String login, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }
    
    public Produto procurarProduto(String codigo, RepositorioProdutos rpr) {
        return rpr.getProdutos().get(codigo);
    }
    
    public Cliente procurarCliente(int matricula, RepositorioPessoa rpe) {
        return (Cliente) rpe.getPessoas().get(matricula);
    }

    public void addLocacao(Cliente c, Produto p, RepositorioLocacoes rlo) {
        Date currentDate = new Date();
        Calendar saida = Calendar.getInstance();
        saida.setTime(currentDate);
        Locacao l = new Locacao(p.getCodigo(), ((Pessoa) c).getMatricula(), saida);
        rlo.getLocacoes().add(l);
    }

    public void baixaLocacao(Locacao l, RepositorioLocacoes rlo){
        Date currentDate = new Date();
        Calendar entrega = Calendar.getInstance();
        entrega.setTime(currentDate);
        l.setDataEntrega(entrega);
        l.calculaMulta();
    }

    public void excluirLocacao(Locacao l, RepositorioLocacoes rlo) {
        rlo.getLocacoes().remove(l);
    }
}
