package Calculadora;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Informe os dados para calcular as parcelas");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("\nVALOR:"));
        double frete = Double.parseDouble(JOptionPane.showInputDialog("\nFRETE:"));
        int parcelas = Integer.parseInt(JOptionPane.showInputDialog("\nPARCELAS:"));

        Parcelas calculo = new Parcelas();

        calculo.calcularParcelas(valor, frete, parcelas);

    }
}
