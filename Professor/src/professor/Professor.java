package professor;

public class Professor {
    
    private String nome;
    private int matricula;
    private int cargaHoraria;
    
    public Professor(String n, int m, int c) {
        setNome(n);
        setMatricula(m);
        setCargaHoraria(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        matricula = m;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int c) {
        cargaHoraria = c;
    }
    
}
