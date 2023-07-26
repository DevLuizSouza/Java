import java.math.BigDecimal;

public class Produto {

    private String nomeProduto;
    private String descricao;

    private BigDecimal preco;




    public Produto(String nomeProduto, String descricao, String preco) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.preco = new BigDecimal(preco);
        }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }


}
