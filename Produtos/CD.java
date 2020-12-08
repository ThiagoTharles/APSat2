package Produtos;

import java.util.Objects;

public class CD extends Musica {
    private boolean arranhado, duplo;

    public CD() {
    }

    public CD(String codigo, String titulo, String genero, boolean locado, String autor, int numFaixas, boolean arranhado, boolean duplo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.autor = autor;
        this.numFaixas = numFaixas;
        this.arranhado = arranhado;
        this.duplo = duplo;
    }

    public boolean isArranhado() {
        return this.arranhado;
    }

    public boolean getArranhado() {
        return this.arranhado;
    }

    public void setArranhado(boolean arranhado) {
        this.arranhado = arranhado;
    }

    public boolean isDuplo() {
        return this.duplo;
    }

    public boolean getDuplo() {
        return this.duplo;
    }

    public void setDuplo(boolean duplo) {
        this.duplo = duplo;
    }

    public CD arranhado(boolean arranhado) {
        this.arranhado = arranhado;
        return this;
    }

    public CD duplo(boolean duplo) {
        this.duplo = duplo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CD)) {
            return false;
        }
        CD cD = (CD) o;
        return arranhado == cD.arranhado && duplo == cD.duplo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(arranhado, duplo);
    }

    @Override
    public String toString() {
        return "{" +
            " arranhado='" + isArranhado() + "'" +
            ", duplo='" + isDuplo() + "'" +
            "}";
    }

    @Override
    public void calcularDiaria() {
        
    }

}
