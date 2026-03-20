public class Veiculo {
    
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.printf("O veículo %s está ligando\n", modelo);
    }
}
