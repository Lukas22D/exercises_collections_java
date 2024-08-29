package set_exercicios.conjunto_convidados;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    //Atributos
    protected Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvidado) {
        this.convidadosSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removeConvidado(int codigoConvidado) {
        // Cria um objeto Convidado com o código do convidado a ser removido
        Convidado convidado_para_remover = null; 
        for (Convidado convidado : this.convidadosSet) {
            if (convidado.codigoConvidado == codigoConvidado) {
                convidado_para_remover = convidado;
                break;
            }
        }
        // Remove o convidado do conjunto
        this.convidadosSet.remove(convidado_para_remover);
    }

    public int quantidadeConvidados() {
        return this.convidadosSet.size();
    }

    public void listaConvidados() {
        for (Convidado convidado : this.convidadosSet) {
            System.out.println(convidado);
        }
    }

}
