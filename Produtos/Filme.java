package Produtos;

import java.util.Objects;

public abstract class Filme extends Produto {
    protected int anoLancamento, duracao;

    public Filme() {
    }

    public Filme(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Filme anoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
        return this;
    }

    public Filme duracao(int duracao) {
        this.duracao = duracao;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Filme)) {
            return false;
        }
        Filme filme = (Filme) o;
        return anoLancamento == filme.anoLancamento && duracao == filme.duracao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoLancamento, duracao);
    }

    @Override
    public String toString() {
        return "{" +
            " anoLancamento='" + getAnoLancamento() + "'" +
            ", duracao='" + getDuracao() + "'" +
            "}";
    }

}
