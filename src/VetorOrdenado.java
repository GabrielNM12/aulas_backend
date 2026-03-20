import java.util.Arrays;

public class VetorOrdenado {

    int capacidade;
    int ultima_posicao;
    String[] valores;

    public VetorOrdenado(int capacidade) {
        this.capacidade = capacidade;
        this.ultima_posicao = -1;

        this.valores = new String[capacidade];
        Arrays.fill(this.valores, "");
    }

    public void imprime() {
        if (this.ultima_posicao == -1) {
            System.out.println("O vetor está vazio");
        }
        else {
            for (int i = 0; i < (this.ultima_posicao + 1); i++) {
                System.out.printf("%d - %s\n",i,this.valores[i]);
            }
        }
    }

    public void inserir(String valor) {

        if (this.ultima_posicao == this.capacidade -1) {
            System.out.println("Capacidade Máxima atingida");
            return;
        }

        int posicao = 0;

        for (int i = 0; i < (this.ultima_posicao + 1); i++) {
            posicao = i;
            if (this.valores[i].compareTo(valor) > 0) {
                break;
            }
            if (i == this.ultima_posicao) {
                posicao = i + 1;
            }
        }

        for (int x = this.ultima_posicao; x >= posicao; x--) {
            this.valores[x + 1] = this.valores[x];
        }

        this.valores[posicao] = valor;
        this.ultima_posicao  += 1;
    }

    public int pesquisa_linear(String valor) {
        for (int i = 0; i < (this.ultima_posicao + 1); i++) {
            if (i == this.ultima_posicao || this.valores[i].compareTo(valor) > 0) {
                return -1;
            }

            if (this.valores[i].equals(valor)) {
                return i;
            }
        }

        return -1;
    }

    public int pesquisa_binaria(String valor) {
        int limite_inferior = 0;
        int limite_superior = this.ultima_posicao;

        while (true) {
            int posicao_atual = ((limite_inferior + limite_superior) / 2);
            if (this.valores[posicao_atual].equals(valor)) {
                return posicao_atual;
            }
            else if (limite_inferior > limite_superior) {
                return -1;
            }
            else {
                if (this.valores[posicao_atual].compareTo(valor) < 0) {
                    limite_inferior = posicao_atual + 1;
                }
                else {
                    limite_superior = posicao_atual - 1;
                }
            }

        }
    }

    public int excluir(String valor) {
        int posicao = this.pesquisa_binaria(valor);
        if (posicao == -1) {
            return -1;
        }

        // Start from the deleted position and pull elements from the right
        for (int i = posicao; i < this.ultima_posicao; i++) {
            this.valores[i] = this.valores[i + 1];
        }

        this.ultima_posicao -= 1;
        return posicao;
    }
}
