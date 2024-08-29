package list_exercicios.lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        var lista = new ListaTarefas();
        var scanner = new Scanner(System.in);
        var opcao = 0;
        var descricao = "";
        
        while (opcao != 5) {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Mostrar quantidade de tarefas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    descricao = scanner.nextLine();
                    lista.addTask(descricao);
                    break;
                case 2:
                    System.out.print("Digite a descrição da tarefa: ");
                    descricao = scanner.nextLine();
                    lista.removeTask(descricao);
                    break;
                case 3:
                    lista.showTasks();
                    break;
                case 4:
                    lista.size();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();

    }
}
