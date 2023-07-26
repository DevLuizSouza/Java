public class Reserva {
    private int codigo;
    private Rota rota;
    private int quantidadePessoas;

    public Reserva(int codigo, Rota rota, int quantidadePessoas) {
        this.codigo = codigo;
        this.rota = rota;
        this.quantidadePessoas = quantidadePessoas;
    }

    public Rota getRota() {
        return rota;
    }

    public double calcularPreco() {
        double preco = quantidadePessoas * 50;

        if (rota.getEstacaoPartida().getNome().equals("Buenos Aires") &&
                rota.getEstacaoDestino().getNome().equals("Bragado")) {
            preco *= 0.8; // Aplica o desconto de 20% para viagens diretas Buenos Aires - Bragado
        }

        return preco;
    }
}
