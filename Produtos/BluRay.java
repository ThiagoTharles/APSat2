package Produtos;

import java.util.Objects;

public class BluRay extends Filme{
    private String[] idiomas = new String[2];

    public BluRay() {
    }

    public BluRay(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, String[] idiomas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.idiomas = idiomas;
    }

    public String[] getIdiomas() {
        return this.idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public BluRay idiomas(String[] idiomas) {
        this.idiomas = idiomas;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BluRay)) {
            return false;
        }
        BluRay bluRay = (BluRay) o;
        return Objects.equals(idiomas, bluRay.idiomas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idiomas);
    }

    @Override
    public String toString() {
        return "{" +
            " idiomas='" + getIdiomas() + "'" +
            "}";
    }

    @Override
    public void calcularDiaria() {
        
    }

}
