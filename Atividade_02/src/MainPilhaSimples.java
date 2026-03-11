public class MainPilhaSimples {
    static void main() {

        PilhaSimples pilhaSimples = new PilhaSimples(4);

        pilhaSimples.empilhar("Arroz");
        pilhaSimples.empilhar("Feijão");
        pilhaSimples.empilhar("Milho");
        pilhaSimples.empilhar("Oleo");
        pilhaSimples.exibir();
        pilhaSimples.desenpilhar();
        pilhaSimples.exibir();
    }
}
