public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        livro1.exibirDados();
        livro2.exibirDados();
    }
}
