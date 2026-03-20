public class ListaEncadeadaSimples {
    
    No primeiro;

    public ListaEncadeadaSimples() {
        this.primeiro = null;
    }

    public void insere_inicio(String valor) {
        No novo = new No(valor);
        novo.proximo = this.primeiro;
        this.primeiro = novo;
    }

    public void insere_inicio(int valor) {
        this.insere_inicio(Integer.toString(valor));
    }

    public void mostrar() {
        
        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return;
        }

        No atual = this.primeiro;
        while (atual != null) {
            atual.mostra_no();
            atual = atual.proximo;
        }
    }

    public No pesquisa(int valor) {
        return this.pesquisa(Integer.toString(valor));
    }

    public No pesquisa(String valor) {

        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return null;
        }

        No atual = this.primeiro;
        while (atual != null && atual.valor != valor) {
            if (atual.proximo == null) {
                return null;
            }
            else {
                atual = atual.proximo;
            }
        }

        return atual;
    }

    public No excluir_inicio() {

        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return null;
        }

        No temp = this.primeiro;
        this.primeiro = this.primeiro.proximo;
        return temp;
    }

    public No excluir_posicao(String valor) {

        if (this.primeiro == null) {
            System.out.println("A lista está vazia");
            return null;
        }

        No atual = this.primeiro;
        No anterior = null;

        while (atual != null && atual.valor != valor) {
            if (atual.proximo == null) {
                return null;
            }
            else {
                anterior = atual;
                atual = atual.proximo;
            }
        }

        if (anterior == null) {
            this.primeiro = this.primeiro.proximo;
        }
        else {
            anterior.proximo = atual.proximo;
        }

        return atual;
    }
}
