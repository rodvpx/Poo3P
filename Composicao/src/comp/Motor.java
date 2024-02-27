package comp;

public class Motor {
    
    private int potencia;
    private double combustivel;
    private String chassi;
    
    public Motor(int potencia, double combustivel, String chassi) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public double getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
}
