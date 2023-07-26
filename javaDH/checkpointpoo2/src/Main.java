import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Produtos");
            System.out.println("2. Clientes");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1 -> produto.manterProdutos();
                    case 2 -> cliente.manterClientes();
                    case 3 -> pedido.realizarPedido();
                    case 4 -> System.exit(0);
                    default -> System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.err.println("\u001B[31mDigite apenas números para continuar!\u001B[0m");
                scanner.nextLine(); // Limpar o buffer do scanner
                opcao = 0; // Definir uma opção inválida para continuar o loop
            }
        } while (opcao != 4);
    }
}
