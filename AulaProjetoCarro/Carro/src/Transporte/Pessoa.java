package Transporte;

public class Pessoa {
    
    private String nome;
    private String corDoCabelo;
    private String biotipo;
    private int idade;
    private Carro carro;

    public Pessoa () {

    }
    
    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }

    public void ligarCarro () {
        carro.ligar();
    }

    public void desligarCarro () {
        carro.desligar();
    }

    public void aceleraCarro () {
        carro.acelerar();
    }

    public void frearCarro () {
        carro.frear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void setCambioMarcha(int marcha){
        carro.setCambio(marcha);
    }

    public void getCambioMarcha(){
        carro.getCambio();
    }
}
