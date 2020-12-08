package Produtos;

import java.util.Objects;

public abstract class Produto {

    protected String codigo, titulo, genero; 
    protected boolean locado;

    public Produto() {
    }

    public Produto(String codigo, String titulo, String genero, boolean locado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isLocado() {
        return this.locado;
    }

    public boolean getLocado() {
        return this.locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public Produto codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Produto titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Produto genero(String genero) {
        this.genero = genero;
        return this;
    }

    public Produto locado(boolean locado) {
        this.locado = locado;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo) && Objects.equals(titulo, produto.titulo) && Objects.equals(genero, produto.genero) && locado == produto.locado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, titulo, genero, locado);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", genero='" + getGenero() + "'" +
            ", locado='" + isLocado() + "'" +
            "}";
    }


    public abstract void calcularDiaria();
}