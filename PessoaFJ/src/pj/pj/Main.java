package pj;

public class Main {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setCpf("888.555.365-55");
        funcionario.setCartao("6555 8555 9655 2");

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getCartao());
    }
    
}
