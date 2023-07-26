public class Departamento extends ProjetoHabitacional {
    private int numeroAndares;
    private int apartamentosPorAndar;

    public Departamento(int numero, String nome, String cidade, String status, String endereco, String dataInicio, String dataTerminoPrevista, String dataTerminoReal, int numeroAndares, int apartamentosPorAndar) {
        super(numero, nome, cidade, status, endereco, dataInicio, dataTerminoPrevista, dataTerminoReal, 0, 0, 0);
        this.numeroAndares = numeroAndares;
        this.apartamentosPorAndar = apartamentosPorAndar;
    }

    public int compararTamanho(Departamento departamento) {
        int tamanhoDepartamentoAtual = this.numeroAndares * this.apartamentosPorAndar;
        int tamanhoDepartamentoComparado = departamento.numeroAndares * departamento.apartamentosPorAndar;

        return (tamanhoDepartamentoAtual > tamanhoDepartamentoComparado) ? 1 : ((tamanhoDepartamentoAtual < tamanhoDepartamentoComparado) ? -1 : 0);
    }

    public boolean isArranhaCeu() {
        return (numeroAndares > 15);
    }
}
