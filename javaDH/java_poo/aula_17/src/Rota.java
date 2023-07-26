public class Rota {
    private Estacao estacaoPartida;
    private Estacao estacaoDestino;

    public Rota(Estacao estacaoPartida, Estacao estacaoDestino) {
        this.estacaoPartida = estacaoPartida;
        this.estacaoDestino = estacaoDestino;
    }

    public Estacao getEstacaoPartida() {
        return estacaoPartida;
    }

    public Estacao getEstacaoDestino() {
        return estacaoDestino;
    }
}
