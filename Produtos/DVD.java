package Produtos;

import java.util.Objects;

public class DVD extends Filme{
    private boolean arranhado;

    public DVD() {
    }

    public DVD(String codigo, String titulo, String genero, boolean locado, int anoLancamento, int duracao, boolean arranhado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.arranhado = arranhado;
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

    public DVD arranhado(boolean arranhado) {
        this.arranhado = arranhado;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DVD)) {
            return false;
        }
        DVD dVD = (DVD) o;
        return arranhado == dVD.arranhado;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(arranhado);
    }

    @Override
    public String toString() {
        return "{" +
            " arranhado='" + isArranhado() + "'" +
            "}";
    }

    @Override
    public void calcularDiaria() {

    }

}
