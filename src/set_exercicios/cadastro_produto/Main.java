package set_exercicios.cadastro_produto;

import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        CatalogoProduto catalogo = new CatalogoProduto();
        catalogo.adicionarProduto("Arroz", 1, 10.0, Optional.of(5));
        catalogo.adicionarProduto("Feijão", 2, 8.0, Optional.of(3));
        catalogo.adicionarProduto("Arroz", 1, 10.0, Optional.of(2));
        catalogo.adicionarProduto("Feijão", 2, 8.0, Optional.of(1));
        catalogo.adicionarProduto("Macarrão", 3, 5.0, Optional.empty());
        catalogo.adicionarProduto("Macarrão", 3, 5.0, Optional.empty());
        System.out.println("Produtos cadastrados:");
        catalogo.mostrarProdutos();
        System.out.println("Produtos com nome 'Arroz':");
        catalogo.exibirProdutoNome("Arroz");
        System.out.println("Produto com código 2:");
        catalogo.exibirProdutoCod(2);
        System.out.println("Produtos ordenados por quantidade:");
        catalogo.ordenarProdutosPorQuantidade();
    }
}
