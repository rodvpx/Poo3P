package Banco;

import javax.swing.JOptionPane;

public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public boolean sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {

        this.saldo += valor;

    }

    public void tranferir(Conta destino, double valor) {

        if(sacar(valor)) {

            destino.depositar(valor);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}