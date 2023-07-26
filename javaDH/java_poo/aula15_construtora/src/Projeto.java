import java.time.LocalDate;

public class Projeto {
    private int numero;
    private String nome;
    private String cidade;
    private String status;
    private String endereco;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private LocalDate dataTerminoReal;

    public Projeto(int numero, String nome, String cidade, String status, String endereco, String dataInicio, String dataTerminoPrevista, String dataTerminoReal) {
        this.numero = numero;
        this.nome = nome;
        this.cidade = cidade;
        this.status = status;
        this.endereco = endereco;
        this.dataInicio = LocalDate.parse(dataInicio);
        this.dataTerminoPrevista = LocalDate.parse(dataTerminoPrevista);
        this.dataTerminoReal = LocalDate.parse(dataTerminoReal);
    }

    public boolean terminouNaData() {
        return (dataTerminoReal.equals(dataTerminoPrevista) && status.equals("terminado"));
    }
}
