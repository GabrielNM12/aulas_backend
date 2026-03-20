public class CarroTest {
    
    public static void main(String[] args) {
        Motor motor = new Motor("ABC", 200);
        Carro carro = new Carro("BMW", 2000, 4, motor);
        Carro carroSemMotor = new Carro("Fusca", 2010, 2, null);

        carro.ligarCarro();
        carro.desligarCarro();

        carroSemMotor.ligarCarro();
        carroSemMotor.desligarCarro();
    }
}
