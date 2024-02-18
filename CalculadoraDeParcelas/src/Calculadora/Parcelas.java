package Calculadora;

import javax.swing.JOptionPane;

public class Parcelas {

    private double valor;
    private double frete;
    private int parcelas;

    public void calcularParcelas(double valor, double frete, int parcelas) {

        double somaTotal = valor + frete;
        double valorParcela = somaTotal / parcelas;

        JOptionPane.showMessageDialog(null, "Valor Total da Compra: R$" + somaTotal);
        JOptionPane.showMessageDialog(null, "\n Valor de " + parcelas + " arcelas, de R$" + valorParcela);

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

}
