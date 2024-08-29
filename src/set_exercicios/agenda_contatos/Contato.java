package set_exercicios.agenda_contatos;

public class Contato {
    private String nome;
    private String telefone;
    
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getTelefone() {
        return this.telefone;
    }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
