package set_exercicios.conjunto_convidados;

public class Main {

    public static void main(String[] args) {
        // Cria um objeto da classe ConjuntoConvidados
        var conjuntoConvidados = new ConjuntoConvidados();
        // Adiciona convidados ao conjunto
        conjuntoConvidados.addConvidado("João", 1);
        conjuntoConvidados.addConvidado("Maria", 2);
        conjuntoConvidados.addConvidado("José", 3);
        // Lista os convidados
        conjuntoConvidados.listaConvidados();
        // Remove um convidado
        conjuntoConvidados.removeConvidado(2 );
        // Lista os convidados
        System.out.println("Lista de convidados após a remoção:");
        conjuntoConvidados.listaConvidados();
    }
    
}
