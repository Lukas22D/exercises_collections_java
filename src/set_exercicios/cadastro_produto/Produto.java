package set_exercicios.cadastro_produto;

public class Produto {
    private String nome;
    private double preco;
    private int cod;
    private int quantidade;

    public Produto(String nome, int cod, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.cod = cod;
        this.quantidade = quantidade;
     }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getCod() {
        return this.cod;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cod=" + cod +
                ", quantidade=" + quantidade +
                '}';
    }
}
