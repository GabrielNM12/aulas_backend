public class Carro extends Veiculo {
    
    public int portas;
    public Motor motor;
    
    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    public Carro(String modelo, int ano, int portas, Motor motor) {
        this(modelo,ano,portas);
        this.motor = motor;
    }

    public void abrirPortas() {
        System.out.printf("Abrindo %d portas do modelo %s\n", this.portas, this.modelo);
    }

    public void ligarCarro() {

        if (this.motor == null) {
            System.out.printf("O carro %s se encontra sem motor, não será possível ligar o carro!\n",modelo);
            return;
        }

        this.motor.ligar();
        System.out.printf("Ligando o carro %s\n",modelo);
    }

    public void desligarCarro() {

        if (this.motor == null) {
            System.out.printf("O carro %s se encontra sem motor\n",modelo);
        }
        else {
            this.motor.desligar();
        }

        System.out.printf("Desligando o carro %s\n",modelo);
    }
}
