public class VetorOrdenadoTest {
    public static void main(String[] args) {

        VetorOrdenado vetorOrdenado = new VetorOrdenado(7);

        vetorOrdenado.inserir("R");
        vetorOrdenado.inserir("O");
        vetorOrdenado.inserir("D");
        vetorOrdenado.inserir("R");
        vetorOrdenado.inserir("I");
        vetorOrdenado.inserir("G");
        vetorOrdenado.inserir("O");

        vetorOrdenado.imprime();

        int pesquisa1 = vetorOrdenado.pesquisa_binaria("R");
        int pesquisa2 = vetorOrdenado.pesquisa_binaria("D");
        int pesquisa3 = vetorOrdenado.pesquisa_binaria("G");

        System.out.println(pesquisa1);
        System.out.println(pesquisa2);
        System.out.println(pesquisa3);

        vetorOrdenado.excluir("R");
        vetorOrdenado.excluir("D");
        vetorOrdenado.excluir("G");

        vetorOrdenado.imprime();
    }
}
