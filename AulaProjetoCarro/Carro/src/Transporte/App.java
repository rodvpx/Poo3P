package Transporte;

public class App {
    public static void main(String[] args) throws Exception {

        Carro carroVazio = new Carro();

        Carro meuCarro = new Carro("Mitsubishi", "Branco", "RTX4050", 4);

        Carro outroCarro = new Carro("Nissan", "Baru", "RTX3050", 2);

        carroVazio.status();
        meuCarro.status();
        outroCarro.status();

        
    }
}
