package Produtos;

import java.util.Objects;

public class LP extends Musica {
    private boolean raro;

    public LP() {
    }

    public LP(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas, boolean raro) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.autor = autor;
        this.numFaixas = numFaixas;
        this.raro = raro;
    }

    public boolean isRaro() {
        return this.raro;
    }

    public boolean getRaro() {
        return this.raro;
    }

    public void setRaro(boolean raro) {
        this.raro = raro;
    }

    public LP raro(boolean raro) {
        this.raro = raro;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LP)) {
            return false;
        }
        LP lP = (LP) o;
        return raro == lP.raro;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(raro);
    }

    @Override
    public String toString() {
        return "{" +
            " raro='" + isRaro() + "'" +
            "}";
    }

    @Override
    public void calcularDiaria() {
        
    }
    
}
