package list_exercicios.ordenacao_list;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoa {
    List<Pessoa> lista;

    public ListaPessoa() {
        this.lista = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura) {
        this.lista.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorAltura() {
        // Ordena a lista de pessoas por altura, do menor para o maior:
        this.lista.sort((p1, p2) -> Double.compare(p1.altura, p2.altura));
    }

    public void ordenarPorIdade() {
        // Ordena a lista de pessoas por idade, do menor para o maior:
        this.lista.sort((p1, p2) -> Integer.compare(p1.idade, p2.idade));
        // Ordena a lista de pessoas por idade, do maior para o menor:
        // this.lista.sort((p1, p2) -> Integer.compare(p2.idade, p1.idade));
    }
    
}
