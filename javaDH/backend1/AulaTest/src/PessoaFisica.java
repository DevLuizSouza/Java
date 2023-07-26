import java.time.LocalDate;
import java.util.Locale;

public class PessoaFisica {
    private String nome;
    private LocalDate dataDeNascimento;

    public PessoaFisica(String nome, Integer idade) {
        this.nome = nome;
        this.dataDeNascimento = LocalDate.now().minusYears(idade);
    }

    public PessoaFisica(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.dataDeNascimento = nascimento;
    }

    public boolean isMaiorDe18Anos() {
        LocalDate a18anosAtras = LocalDate.now().minusYears(18);
        return a18anosAtras.isAfter(dataDeNascimento);
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }
}
