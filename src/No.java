public class No {
    String valor;
    No proximo;

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public void mostra_no() {
        System.out.println(this.valor);
    }
}
