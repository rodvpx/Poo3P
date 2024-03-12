package professor;

public class ProfHorista extends Professor {

	private double salarioHora;

	public ProfHorista(String n, int m, int c, double s) {
		super(n, m, c);
		setSalarioHora(s);
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double s) {
		salarioHora = s;
	}

	public double getSalario() {
		return (salarioHora * getCargaHoraria() * 4.5);
	}


	

}