package set_exercicios.cadastro_produto;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class CatalogoProduto {
    private Set<Produto> produtos;

    public CatalogoProduto() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cod, double preco, Optional<Integer> quantidade) {
        // Tenta encontrar um produto no catálogo que tenha o mesmo código informado
        Optional<Produto> produtoExistente = produtos.stream()
                // Filtra o conjunto de produtos, procurando aquele que tenha o código igual ao
                // fornecido
                .filter(produto -> produto.getCod() == cod)
                // Se encontrar algum produto que atenda à condição do filtro, retorna o
                // primeiro encontrado (findFirst())
                .findFirst();

        // Verifica se algum produto foi encontrado com o código fornecido
        if (produtoExistente.isPresent()) {
            // Como o produto já existe, obtém o produto encontrado (desembrulhando o
            // Optional)
            Produto produto = produtoExistente.get();

            // Incrementa a quantidade do produto existente com a quantidade fornecida
            // Se a quantidade não for fornecida, incrementa com 1
            int novaQuantidade = produto.getQuantidade() + quantidade.orElse(1);

            // Atualiza a quantidade do produto no catálogo
            produto.setQuantidade(novaQuantidade);
        } else {
            // Se nenhum produto com o código fornecido foi encontrado, cria um novo produto
            // A quantidade do novo produto é definida pelo valor fornecido ou 0 se a
            // quantidade não for informada
            Produto novoProduto = new Produto(nome, cod, preco, quantidade.orElse(0));

            // Adiciona o novo produto ao catálogo
            produtos.add(novoProduto);
        }
    }

    public void mostrarProdutos() {
        // Mostra todos os produtos do catálogo, "::" é uma forma de referenciar um
        // método, sem a necessidade de criar uma lambda
        // Noca caso "::" está sendo utilizado para referenciar o método println da
        // classe System.out
        produtos.forEach(System.out::println);
    }

    public void exibirProdutoNome(String nome){
        this.produtos.stream().filter(produto -> produto.getNome().equals(nome)).forEach(System.out::println);
    }

    public void exibirProdutoCod(int cod){
        this.produtos.stream().filter(produto -> produto.getCod() == cod).forEach(System.out::println);
    }

    public void exibirProdutoPreco(double preco){
        this.produtos.stream().filter(produto -> produto.getPreco() == preco).forEach(System.out::println);
    }

    public void ordenarProdutosPorQuantidade(){
        this.produtos.stream().sorted((p1, p2) -> p2.getQuantidade() - p1.getQuantidade()).forEach(System.out::println);
    }
}
