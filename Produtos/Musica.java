package Produtos;

import java.util.Objects;

public abstract class Musica extends Produto {
    protected String autor;
    protected int numFaixas;

    public Musica() {
    }

    public Musica(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.autor = autor;
        this.numFaixas = numFaixas;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumFaixas() {
        return this.numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public Musica autor(String autor) {
        this.autor = autor;
        return this;
    }

    public Musica numFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Musica)) {
            return false;
        }
        Musica musica = (Musica) o;
        return Objects.equals(autor, musica.autor) && numFaixas == musica.numFaixas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, numFaixas);
    }

    @Override
    public String toString() {
        return "{" +
            " autor='" + getAutor() + "'" +
            ", numFaixas='" + getNumFaixas() + "'" +
            "}";
    }
    
}
