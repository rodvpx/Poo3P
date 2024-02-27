package comp;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Direcao direcao1 = new Direcao("Branca", 24.5, true);

        Motor motor1 = new Motor(525, 80, "7578951");
        
        Automovel veiculo1 = new Automovel();

        veiculo1.setDirecao(direcao1);
        veiculo1.setMotor(motor1);

        StringBuilder mensagem = new StringBuilder();

        mensagem.append("\nCOR: " + veiculo1.getDirecao().getCor());
        mensagem.append("\nTAMANHO ARO: " + veiculo1.getDirecao().getTamanhoRaio());
        mensagem.append("\nKIT MULTIMIDIA: " + veiculo1.getDirecao().isKitMultimidia());
        mensagem.append("\nPOTENCIA: " + veiculo1.getMotor().getPotencia() + " CAVALOS");
        mensagem.append("\nCOBUSTIVEL: " + veiculo1.getMotor().getCombustivel() + " L");
        mensagem.append("\nCHASSI: " + veiculo1.getMotor().getChassi());

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
