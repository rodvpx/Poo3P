package heranca;
public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario("Lucas", 1412.00);
        Gerente gerente = new Gerente("Kelvin", 2500.00, 2);
        Secretaria secretaria = new Secretaria("Cris", 1500.75, "5");

        System.out.println(funcionario.toString());
        System.out.println(gerente.toString());
        System.out.println(secretaria.toString());

        Secretaria s = new Secretaria();
        System.out.println(s.toString());
    }
}
