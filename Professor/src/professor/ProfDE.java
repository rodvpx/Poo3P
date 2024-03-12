package professor;

public class ProfDE extends Professor {

    private double salario;

    public ProfDE(String n, int m, double s) {
        super(n, m, 40);
        setSalario(s);
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double s) {
        salario = s;
    }

    
}