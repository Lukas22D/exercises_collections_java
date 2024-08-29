package list_exercicios.catalogo_de_livro;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        var catalogo = new CatalogoLivro();
        
        var scanner = new Scanner(System.in);
        var opcao = 0;
        
        while (opcao != 4) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Pesquisar livro por autor");
            System.out.println("3 - Pesquisar por perido de anos");
            System.out.println("4 - Listar livros");
            System.out.println("5 - Sair");
            
            
            do{
            opcao = scanner.nextInt();    
            switch (opcao) {
            case 1:
                System.out.println("Digite o título do livro:");
                var titulo = scanner.next();
                System.out.println("Digite o autor do livro:");
                var autor = scanner.next();
                System.out.println("Digite o ano do livro:");
                var ano = scanner.nextInt();
                catalogo.addLivro(titulo, autor, ano);
                break;
            case 2:
                System.out.println("Digite o autor para pesquisa:");
                 
                catalogo.pesquisarPorAutor(scanner.next());
                break;
            case 4:
                catalogo.getLivros();
                break;
            case 3:
                catalogo.pesquisarPorIntervaloAnos(scanner.nextInt(), scanner.nextInt());
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            }
        
        }while(opcao != 5);
        }
        
        scanner.close();
        
        
    }

}
