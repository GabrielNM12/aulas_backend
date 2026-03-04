public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibir() {
        System.out.printf("Nome: %s, Preço: %.2f, Quantidade: %d\n", nome, preco, quantidade);
    }
}
