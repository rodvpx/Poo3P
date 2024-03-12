package heranca;

public class Gerente extends Funcionario {

    private int sala;
    
    public Gerente(String nome, double salario, int sala){
        super(nome, salario);
        this.sala = sala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Gerente [sala=" + sala + "]";
    }

}
