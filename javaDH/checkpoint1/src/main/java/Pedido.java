import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDate data;

    public Pedido(LocalDate data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

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

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }



}
