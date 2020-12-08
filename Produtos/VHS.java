package Produtos;

import java.util.Objects;

public class VHS extends Filme{
    private boolean cores;

    public VHS() {
    }

    public VHS(String codigo, String titulo, String genero, boolean locado, int anoLancamento, boolean cores, int duracao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.locado = locado;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.cores = cores;
    }

    public boolean isCores() {
        return this.cores;
    }

    public boolean getCores() {
        return this.cores;
    }

    public void setCores(boolean cores) {
        this.cores = cores;
    }

    public VHS cores(boolean cores) {
        this.cores = cores;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VHS)) {
            return false;
        }
        VHS vHS = (VHS) o;
        return cores == vHS.cores;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cores);
    }

    @Override
    public String toString() {
        return "{" +
            " cores='" + isCores() + "'" +
            "}";
    }

    @Override
    public void calcularDiaria() {
        
    }

}
