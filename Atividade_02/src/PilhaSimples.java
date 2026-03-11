public class PilhaSimples {

    String [] pilha;

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
        System.out.println("Existem " + tamanho + " elementos!");
    }

    public void empilhar(String elemento) {
        if (!estaCheia()) {
            for (int i = 0; i < this.pilha.length; i++) {
                if(this.pilha[i] == null) {
                    this.pilha[i] = elemento;
                    System.out.println("O valor " + elemento + " foi inserido na Elemento!");
                    return;
                }
            }
        }
    }

    public void desenpilhar() {
        if(!estaVazia()) {
            for (int i = this.pilha.length-1; i > 0; i--) {
                if (this.pilha[i] != null) {
                    this.pilha[i] = null;
                    return;
                }
            }
        }
    }

    public void exibir() {
        for (int i = 0; i < this.pilha.length; i++) {
            System.out.println(this.pilha[i]);
        }
    }

    public boolean estaCheia() {
        if (this.pilha[pilha.length-1] != null) {
            System.out.println("A Pilha está cheia.");
            return true;
        } else {
            return false;
        }
    }

    public boolean estaVazia() {
        if(this.pilha[0] == null) {
            System.out.println("A Pilha está vazia.");
            return true;
        } else {
            return false;
        }
    }
}
