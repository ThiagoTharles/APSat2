package Repositorios;

import java.util.HashMap;

import Atores.Cliente;
import Atores.OperadorDeSistemas;
import Atores.Pessoa;

public class RepositorioPessoa {
    private HashMap<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();

    public RepositorioPessoa(HashMap<Integer, Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public HashMap<Integer,Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(HashMap<Integer,Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    public void listar(){
        for (Pessoa i : pessoas.values()) {
            System.out.println(i.getNome());
        }
    }

    public void listarOperadores(){
        for (Pessoa i : pessoas.values()) {
            if(i instanceof OperadorDeSistemas)
                System.out.println(i.getNome());
        }
    }

    public void listarClientes(){
        for (Pessoa i : pessoas.values()) {
            if(i instanceof Cliente)
                System.out.println(i.getNome());
        }
    }
}
