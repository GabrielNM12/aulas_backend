public class Motor {
    private int potencia;
    private String tipo;

    public Motor(String tipo, int potencia) {
        this.tipo     = tipo;
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.printf("Motor %s - %d está ligando!\n",tipo,potencia);
    }

    public void desligar() {
        System.out.printf("Motor %s - %d está desligando!\n",tipo,potencia);
    }
}
