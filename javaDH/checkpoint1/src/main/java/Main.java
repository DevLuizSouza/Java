

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {




    public static void main(String[] args) {
        Confeitaria confeitaria = new Confeitaria();
        Produto produto1 = new Produto("Bolo Cholate", "Pão-de-ló chocolate", "79.00");
        confeitaria.adicionarProduto(produto1);
        Cliente cliente1 = new Cliente("Luiz", "de Souza", "060.486.149-40", "emailcliente1@example.com", 11, 999999999, LocalDate.of(1990, 1, 1), "Rua Maria Marcolina n 113 ");
        confeitaria.adicionarCliente(cliente1);

        LocalDate dataPedido = LocalDate.now();
        Pedido pedido = new Pedido(dataPedido, cliente1);
        pedido.adicionarProduto(produto1);
        System.out.println("================================================");
        System.out.println("Data do Pedido: " + pedido.getData());
        System.out.println("Cliente: " + pedido.getCliente().getNome() + " " + pedido.getCliente().getSobrenome());
        System.out.println("Endereço de Entrega: " + pedido.getCliente().getEndereco());

        System.out.println("------------------------------------------------");
        System.out.println("Produtos:");

        List<Produto> listaProdutos = pedido.getProdutos();
        for (Produto produto : listaProdutos) {
            System.out.println("Nome do Produto: " + produto.getNomeProduto());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("============================================");
        }


    }
}