package Transporte;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Preto");
        carro.setTipo("Passeio");
        carro.setPlaca("GGG-0520");
        carro.setNumPortas(4);

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Lara");
        pessoa.setCorDoCabelo("Loiro");
        pessoa.setBiotipo("Magra");
        pessoa.setIdade(30);

        carro.setDono(pessoa);

        StringBuilder mensagem = new StringBuilder();

        mensagem.append("----CARRO----");
        mensagem.append("\nCOR: " + carro.getCor());
        mensagem.append("\nTIPO: " + carro.getTipo());
        mensagem.append("\nPLACA: " + carro.getPlaca());
        mensagem.append("\nPORTAS: " + carro.getNumPortas());
        mensagem.append("\nDONO: " + carro.getDono().getNome());

        JOptionPane.showMessageDialog(null, mensagem.toString());

    }
}
