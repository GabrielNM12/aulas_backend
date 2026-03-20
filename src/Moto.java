public class Moto extends Veiculo {
    public boolean temBagageiro;

    public Moto(String modelo, int ano, boolean temBagageiro) {
        super(modelo, ano);
        this.temBagageiro = temBagageiro;
    }

    public void empinar() {
        System.out.printf("A moto %s está empinando!\n", modelo);        
    }
}
