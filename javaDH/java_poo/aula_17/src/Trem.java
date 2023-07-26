import java.util.ArrayList;
import java.util.List;

public class Trem {
    private List<Reserva> reservas;
    private List<Estacao> estacoes;

    public Trem(List<Estacao> estacoes) {
        this.estacoes = estacoes;
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }



    public double valorTotal() {
        double valorTotal = 0.0;

        for (Reserva reserva : reservas) {
            valorTotal += reserva.calcularPreco();
        }

        return valorTotal;
    }

    public int quantVezesVisitada(Estacao estacao) throws EstacaoNaoEncontradaException {
        if (!estacoes.contains(estacao)) {
            throw new EstacaoNaoEncontradaException("Estação não encontrada");
        }

        int quantVezes = 0;

        for (Reserva reserva : reservas) {
            Rota rota = reserva.getRota();
            Estacao estacaoPartida = rota.getEstacaoPartida();
            Estacao estacaoDestino = rota.getEstacaoDestino();

            if (estacaoPartida.equals(estacao) || estacaoDestino.equals(estacao)) {
                quantVezes++;
            }
        }

        return quantVezes;
    }
}
