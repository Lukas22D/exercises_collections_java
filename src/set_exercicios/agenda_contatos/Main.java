package set_exercicios.agenda_contatos;

public class Main {
    
    public static void main(String[] args) {
        // Cria um objeto da classe AgendaContato
        var agendaContato = new AgendaContato();
        // Adiciona contatos à agenda
        agendaContato.adicionarContato("João", "1234-5678");
        agendaContato.adicionarContato("Maria", "8765-4321");
        agendaContato.adicionarContato("José", "4321-8765");
        // Exibe os contatos
        System.out.println("Contatos na agenda:");
        agendaContato.exibirContatos();
        // Atualiza um contato
        agendaContato.atualizarContato("Maria", "9999-9999");
        // Exibe os contatos
        System.out.println("Contatos na agenda após a atualização:");
        agendaContato.exibirContatos();
        // Pesquisa um contato
        System.out.println("Pesquisando contato:");
        agendaContato.pesquisarContato("José");
    }
}
