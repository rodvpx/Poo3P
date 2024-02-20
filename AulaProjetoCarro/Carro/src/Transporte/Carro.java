package Transporte;

import javax.swing.JOptionPane;

public class Carro {

    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private Pessoa dono;

    public Carro() {
        
    }

    public Carro(String tipo, String cor, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    public void status() {

        JOptionPane.showMessageDialog(null, "TIPO: " + this.tipo + "\n COR: " + this.cor + "\n PLACA: " + this.placa
                + "\n PORTAS: " + this.numPortas + "\n");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

}
