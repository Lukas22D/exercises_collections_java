package list_exercicios.catalogo_de_livro;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivro {
       private List<Livro> listaLivros;
    public CatalogoLivro() {
       this.listaLivros = new ArrayList<>();
    }

    public void pesquisarPorAutor(String autor){
        // stream() é um método que retorna uma sequência de elementos
        // filter() é um método que filtra os elementos de acordo com um predicado
        // forEach() é um método que executa uma ação para cada elemento
        listaLivros.stream().filter(livro -> livro.autor.equals(autor)).forEach(livro -> System.out.println("Titulo: " + livro.titulo + " Autor: " + livro.autor + " Ano: " + livro.ano));
    }

    public void pesquisarPorIntervaloAnos(int anoInicio, int anoFim){
        listaLivros.stream().filter(livro -> livro.ano >= anoInicio && livro.ano <= anoFim).forEach(livro -> System.out.println("Titulo: " + livro.titulo + " Autor: " + livro.autor + " Ano: " + livro.ano));
    }

    public void addLivro(String titulo, String autor, int ano) {
        var livro = new Livro(titulo, autor, ano);
        this.listaLivros.add(livro);
    }

    public void getLivros() {
        for (Livro livro : listaLivros) {
            System.out.println("Titulo: " + livro.titulo + " Autor: " + livro.autor + " Ano: " + livro.ano);
        }
    }
    
}
