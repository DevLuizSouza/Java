import java.math.BigDecimal;
import java.util.Scanner;

public class PagamentoPix extends Pagamento {
    private String tipoChave;
    private String chave;

    public PagamentoPix() {
        super();
    }

    public String getTipoChave() {
        return tipoChave;
    }

    public void setTipoChave(String tipoChave) {
        this.tipoChave = tipoChave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public static void processarPagamento() {
        System.out.println("Pagamento com pix realizado com sucesso.");
    }
}
