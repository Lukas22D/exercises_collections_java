package list_exercicios.ordenacao_list;

public class Main {

    public static void main(String[] args) {
        var listPeople = new ListaPessoa();
        listPeople.addPessoa("João", 20, 1.80);
        listPeople.addPessoa("Maria", 25, 1.70);
        listPeople.addPessoa("José", 30, 1.90);
        listPeople.addPessoa("Ana", 35, 1.60);
        listPeople.addPessoa("Pedro", 40, 1.75);
        
        System.out.println("Lista de pessoas:");
        listPeople.lista.forEach(p -> System.out.println(p.nome + " - " + p.idade + " anos - " + p.altura + "m"));
        
        System.out.println("\nOrdenando por altura:");
        listPeople.ordenarPorAltura();
        listPeople.lista.forEach(p -> System.out.println(p.nome + " - " + p.idade + " anos - " + p.altura + "m"));
        
        System.out.println("\nOrdenando por idade:");
        listPeople.ordenarPorIdade();
        listPeople.lista.forEach(p -> System.out.println(p.nome + " - " + p.idade + " anos - " + p.altura + "m"));
    }
    
}
