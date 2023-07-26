import java.math.BigDecimal;
import java.util.Scanner;

public class Pagamento {
    private BigDecimal valor;
    private Integer id;
    private Integer versao;

    public Pagamento() {
        this.valor = valor;
        this.id = id;
        this.versao = versao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }

    public void dadosPagamento(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Pagamento Cartão");
        System.out.println("2 - Pagamento Pix");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                PagamentoCartao.processarPagamento();
                System.out.println("Realizando Pagamento Cartão...");
                break;
            case 2:
                PagamentoPix.processarPagamento();
                System.out.println("Realizando Pagamento Pix...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

}
