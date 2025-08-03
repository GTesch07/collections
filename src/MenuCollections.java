import java.util.*;

public class MenuCollections {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<>();
        Set<String> conjunto = new HashSet<>();
        Map<String, Integer> mapa = new HashMap<>();

        int option;

        do {
            System.out.println("\n--- MENU COLLECTIONS ---");
            System.out.println("1 - Adicionar item à Lista");
            System.out.println("2 - Adicionar item ao Conjunto (Set)");
            System.out.println("3 - Adicionar item ao Mapa (Map)");
            System.out.println("4 - Exibir Lista");
            System.out.println("5 - Exibir Conjunto");
            System.out.println("6 - Exibir Mapa");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Digite um item para adicionar à lista: ");
                    String itemList = scanner.nextLine();
                    lista.add(itemList);
                    System.out.println("Item adicionado à lista!");
                    break;
                }

                case 2 -> {
                    System.out.println("Digite um item para adicionar ao conjunto: ");
                    String itemSet = scanner.nextLine();
                    if (conjunto.add(itemSet)) {
                        System.out.println("Item adicionado ao conjunto!");
                    } else {
                        System.out.println("Item já existe no conjunto!");
                    }
                    break;
                }

                case 3 -> {
                    System.out.println("Digite a chave (nome): ");
                    String key = scanner.nextLine();
                    System.out.println("Digite o valor (idade): ");
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    mapa.put(key, value);
                    System.out.println("Adicionado ao mapa.");
                    break;
                }

                case 4 -> {
                    System.out.println("Lista: " + lista);
                    break;
                }

                case 5 -> {
                    System.out.println("Conjunto: " + conjunto);
                    break;
                }

                case 6 -> {
                    System.out.println("Mapa: " + mapa);
                    break;
                }

                case 7 -> {
                    System.out.println("Saindo...");
                    break;
                }

                default -> {
                    System.out.println("Opção inválida!");
                    break;
                }
            }
        } while (option != 7);
        scanner.close();
    }
}
