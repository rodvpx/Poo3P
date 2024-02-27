package comp;

public class Direcao {
    
    private String cor;
    private Double tamanhoRaio;
    private boolean kitMultimidia;
    
    public Direcao(String cor, Double tamanhoRaio, boolean kitMultimidia) {
        this.cor = cor;
        this.tamanhoRaio = tamanhoRaio;
        this.kitMultimidia = kitMultimidia;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Double getTamanhoRaio() {
        return tamanhoRaio;
    }
    public void setTamanhoRaio(Double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }
    public boolean isKitMultimidia() {
        return kitMultimidia;
    }
    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }
}
