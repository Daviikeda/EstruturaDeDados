public class MainPilhaDinamica {
    static void main() {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Arroz");
        pilhaDinamica.empilhar("Sabão");
        pilhaDinamica.empilhar("Uva");
        pilhaDinamica.empilhar("Oleo");
        pilhaDinamica.exibir();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibir();
    }
}
