import java.util.HashSet;
import java.util.Set;

import tesch.guilherme.models.Pessoa;

public class ExemplesSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa joao = new Pessoa(1L, "João");
        pessoas.add(joao);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getName());
        }

        System.out.println("---------------");

        boolean adicionou = pessoas.add(new Pessoa(1L, "João"));
        if (adicionou) {
            System.out.println("Adicionou!");
        } else {
            System.out.println("Não adicionou!");
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getName());
        }

        // O método hashCode (junto com o equals) da classe Pessoa foi usado pelo Set
        // para verificar se o elemento já existia no conjunto. Como o objeto com mesmo
        // ID e nome já estava presente, ele não foi adicionado novamente.

    }
}
