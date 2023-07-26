import java.math.BigDecimal;
import java.time.LocalDate;

public class PacienteParticular extends Paciente {

    private BigDecimal valorConsulta;
    private int numeroRg;

    public PacienteParticular(String nome, String sobrenome, LocalDate dataNascimento, boolean primeiraConsulta,
                              BigDecimal valorConsulta, int numeroRg) {
        super(nome, sobrenome, dataNascimento, primeiraConsulta);
        this.valorConsulta = valorConsulta;
        this.numeroRg = numeroRg;
    }

    public BigDecimal getValorConsulta() {
        return valorConsulta;
    }

    public int getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(int numeroRg) {
        this.numeroRg = numeroRg;
    }
}