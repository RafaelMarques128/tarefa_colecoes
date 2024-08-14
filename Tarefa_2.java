package tarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarefa_2 {

    public static void main(String[] args) {
        // Criar ArrayLists para armazenar os nomes por gênero
        ArrayList<String> nomesFemininos = new ArrayList<>();
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop para permitir que o usuário adicione nomes até decidir parar
        while (true) {
            System.out.println("Digite um nome seguido do gênero (F ou M), no formato 'Nome-Gênero' (ou 'sair' para terminar):");
            String input = scanner.nextLine();

            // Verificar se o usuário quer sair
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            // Dividir a entrada em nome e gênero usando o hífen
            String[] partes = input.split("-");
            if (partes.length != 2) {
                System.out.println("Entrada inválida. Use o formato 'Nome-Gênero'.");
                continue;
            }

            String nome = partes[0].trim();
            String genero = partes[1].trim().toUpperCase();

            // Adicionar o nome à lista correspondente com base no gênero
            if (genero.equals("F")) {
                nomesFemininos.add(nome);
            } else if (genero.equals("M")) {
                nomesMasculinos.add(nome);
            } else {
                System.out.println("Gênero inválido. Use 'F' para feminino ou 'M' para masculino.");
            }
        }

        // Ordenar as listas de nomes por gênero
        Collections.sort(nomesFemininos);
        Collections.sort(nomesMasculinos);

        // Exibir a lista de nomes femininos
        System.out.println("\nNomes Femininos:");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        // Exibir a lista de nomes masculinos
        System.out.println("\nNomes Masculinos:");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        // Fechar o scanner
        scanner.close();
    }
}