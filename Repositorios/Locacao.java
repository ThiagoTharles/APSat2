package Repositorios;

import java.util.Calendar;

public class Locacao {
    String codigoProduto;
    int matriculaCliente;
    Calendar DataSaida, DataEntrega;

    public Locacao(String codigoProduto, int matriculaCliente, Calendar dataSaida) {
        this.codigoProduto = codigoProduto;
        this.matriculaCliente = matriculaCliente;
        DataSaida = dataSaida;
    }

    public String getCodigoProduto() {
        return this.codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getMatriculaCliente() {
        return this.matriculaCliente;
    }

    public void setMatriculaCliente(int matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    public Calendar getDataSaida() {
        return this.DataSaida;
    }

    public void setDataSaida(Calendar DataSaida) {
        this.DataSaida = DataSaida;
    }

    public Calendar getDataEntrega() {
        return this.DataEntrega;
    }

    public void setDataEntrega(Calendar DataEntrega) {
        this.DataEntrega = DataEntrega;
    }
    
    public void calculaMulta() {
        Calendar dataProposta = DataSaida;
        dataProposta.add(Calendar.MONTH, 1);
        if (dataProposta.after(DataEntrega)); {
            System.out.println("MULTA!");
        }
    }
}
