
package exemplo.swing.modelo;

import java.util.Date;


public class Valet {
    private String modelo;
    private String placa;
    private Date entrada;
    private double preco;

    public Valet(String modelo, String placa, Date entrada) {
        this.modelo = modelo;
        this.placa = placa;
        this.entrada = entrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
