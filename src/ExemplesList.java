import java.util.ArrayList;
import java.util.List;

import tesch.guilherme.models.Pessoa;

public class ExemplesList {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(1L, "Guilherme")); // Instancia uma Pessoa e adiciona na posição 0 da lista

        Pessoa a = pessoas.get(0); // Recupera a pessoa da posição 0 da lista e atribui à variável 'a'

        for (Pessoa pessoa : pessoas) { // Utilizar for-each para percorrer elementos de uma lista.
            System.out.println(pessoa.getName());
        } // Percorre a lista e imprime o nome de cada pessoa

        System.out.println("-----------------");

        pessoas.add(a); // Adiciona novamente a mesma instância de 'Pessoa' (referência contida em 'a')
                        // à lista

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getName());
        } // Percorre e imprime a lista novamente, agora com duas referências à mesma
          // pessoa
    }
}
