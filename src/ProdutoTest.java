public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Notebook", 3500.00);
        Produto produto3 = new Produto("Smartphone", 1500.00, 10);

        produto1.exibir();
        produto2.exibir();
        produto3.exibir();
    }
}
