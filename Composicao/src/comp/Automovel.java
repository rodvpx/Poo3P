package comp;

public class Automovel {
    
    private Motor motor;
    private Direcao direcao;

    public Automovel(){
        
    }
    
    public Automovel(Motor motor, Direcao direcao) {
        this.motor = motor;
        this.direcao = direcao;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Direcao getDirecao() {
        return direcao;
    }
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}
