import java.time.LocalDate;

public class Paciente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private boolean primeiraConsulta;

    public Paciente(String nome, String sobrenome, LocalDate dataNascimento, boolean primeiraConsulta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.primeiraConsulta = primeiraConsulta;
    }

    public boolean isPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }
}
