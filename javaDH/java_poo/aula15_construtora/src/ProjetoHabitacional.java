public abstract class ProjetoHabitacional extends Projeto {
    private double tamanhoTerreno;
    private int numeroBanheiros;
    private int numeroQuartos;

    public ProjetoHabitacional(int numero, String nome, String cidade, String status, String endereco, String dataInicio, String dataTerminoPrevista, String dataTerminoReal, double tamanhoTerreno, int numeroBanheiros, int numeroQuartos) {
        super(numero, nome, cidade, status, endereco, dataInicio, dataTerminoPrevista, dataTerminoReal);
        this.tamanhoTerreno = tamanhoTerreno;
        this.numeroBanheiros = numeroBanheiros;
        this.numeroQuartos = numeroQuartos;
    }
}
