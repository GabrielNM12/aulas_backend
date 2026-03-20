public class ListaEncadeadaSimplesTest {
    public static void main(String[] args) {

        ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
        
        lista.mostrar();

        lista.insere_inicio("r");
        lista.insere_inicio("o");
        lista.insere_inicio("d");
        lista.insere_inicio("r");
        lista.insere_inicio("i");
        lista.insere_inicio("g");
        lista.insere_inicio("o");

        lista.insere_inicio("r");
        lista.insere_inicio("o");
        lista.insere_inicio("d");

        lista.excluir_posicao("r");

        lista.mostrar();

        lista.excluir_inicio();
        lista.mostrar();

        No pesquisa = lista.pesquisa("o");
        System.out.println(pesquisa.valor);

        lista.excluir_posicao("o");
        lista.mostrar();

        System.out.println(lista.primeiro);

        lista.insere_inicio(1);
        lista.insere_inicio(4);
        lista.insere_inicio(7);

        lista.mostrar();

        No v = lista.pesquisa(1);
        System.out.println(v != null ? v.valor : "Elemento não encontrado");

        lista.excluir_inicio();
        lista.mostrar();
    }
}
