package heranca;

public class Secretaria extends Funcionario {

    private String ramal;

    public Secretaria(){
        super(null, 0);
    }

    public Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        return "Secretaria [ramal=" + ramal + ", toString()= " + super.toString() +"]";
    }
    
}
