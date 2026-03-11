public class PilhaDinamica {

    No inicio;

    public PilhaDinamica() {
        System.out.println("Pilha dinâmica criada com sucesso!");
        this.inicio = new No(null);
    }

    public void empilhar(String elemento) {
        if (estaVazio()) {
            this.inicio.setConteudo(elemento);
            System.out.println("Elemento " + elemento + " adicionado na pilha!");
        } else {
            No novoNo = new No(elemento);
            novoNo.setProx(this.inicio);
            this.inicio = novoNo;
            System.out.println("Elemento " + elemento + " adicionado na pilha!");
        }
    }

    private boolean estaVazio() {
        if (this.inicio.getConteudo() == null) {
            System.out.println("A pilha está vazia!");
            return true;
        } else {
            return false;
        }
    }

    public void exibir() {
        if (!estaVazio()) {

            // pilha auxiliar para inverter
            java.util.Stack<String> auxStack = new java.util.Stack<>();

            No aux = this.inicio;

            while (aux != null) {
                auxStack.push(aux.getConteudo());
                aux = aux.getProx();
            }

            while (!auxStack.isEmpty()) {
                System.out.println(auxStack.pop());
            }
        }
    }

    public void desempilhar() {
        if (!estaVazio()) {
            if (this.inicio.getProx() == null) {
                System.out.println("Elemento " + this.inicio.getConteudo() + " removido da pilha.");
                this.inicio.setConteudo(null);
            } else {
                System.out.println("Elemento " + this.inicio.getConteudo() + " removido da pilha.");
                this.inicio = this.inicio.getProx();
            }
        }
    }
}