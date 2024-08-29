package set_exercicios.agenda_contatos;
import java.util.Set;
import java.util.HashSet;

public class AgendaContato {
    protected Set<Contato> contatosSet;
    
    public AgendaContato() {
        this.contatosSet = new HashSet<>();
    }

    public void exibirContatos() {
        for (Contato contato : this.contatosSet) {
            System.out.println(contato.getNome() + " - " + contato.getTelefone());
        }
    }

    public void adicionarContato(String nome, String telefone) {
        this.contatosSet.add(new Contato(nome, telefone));
    }

    public void atualizarContato(String nome, String novoTelefone) {
        for (Contato contato : this.contatosSet) {
            if (contato.getNome().equals(nome)) {
                contato.setTelefone(novoTelefone);
                System.out.println("Contato atualizado: " + contato.getNome() + " - " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void pesquisarContato(String nome) {
        for (Contato contato : this.contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println(contato.getNome() + " - " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }
}
