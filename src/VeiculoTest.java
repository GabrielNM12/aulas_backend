public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", 2014, 4);
        Moto moto = new Moto("Fiat", 2014, false);

        carro.ligar();
        carro.abrirPortas();

        moto.empinar();
    }
}
