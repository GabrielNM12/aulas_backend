public class PessoaTest {
    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Ana");
        Pessoa pessoa3 = new Pessoa("Carlos", 25);

        pessoa1.exibir();
        pessoa2.exibir();
        pessoa3.exibir();
    }
}
