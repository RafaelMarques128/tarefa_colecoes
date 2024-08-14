package tarefa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Tarefa_1 {
    public static void main(String[] args) {
        // Criar uma ArrayList para armazenar os nomes
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Loop para permitir que o usuário adicione nomes até decidir parar
        while (true) {
            System.out.println("Digite um nome (ou 'sair' para terminar):");
            String input = scanner.nextLine();

            // Verificar se o usuário quer sair
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            // Adicionar o nome à lista
            nomes.add(input);
        }

        // Ordenar a lista de nomes
        Collections.sort(nomes);

        // Exibir a lista de nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fechar o scanner
        scanner.close();
    }
}
