import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Confeitaria {

    private List<Produto> listaProdutos;
    private List<Cliente> listaClientes;

    public Confeitaria() {
        listaProdutos = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }


    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }





}
