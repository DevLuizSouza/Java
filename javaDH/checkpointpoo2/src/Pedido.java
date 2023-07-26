import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDate data;



    public Pedido() {
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }
    Pagamento pagamento = new Pagamento();
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public BigDecimal cacularValorTotal(){
        BigDecimal valorTotal = BigDecimal.ZERO;
        for(Produto produto: produtos){
            valorTotal = valorTotal.add(produto.getPreco());
        }
        return valorTotal;    }

    public void realizarPedido() {
        System.out.println("Pedido Realizado com sucesso");
        pagamento.dadosPagamento();
    }
}
