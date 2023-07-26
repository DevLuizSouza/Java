import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estacao buenosAires = new Estacao("Buenos Aires");
        Estacao bragado = new Estacao("Bragado");
        Estacao lujan = new Estacao("Luján");
        Estacao suipacha = new Estacao("Suipacha");

        Rota rota1 = new Rota(buenosAires, bragado);
        Rota rota2 = new Rota(lujan, bragado);

        Reserva reserva1 = new Reserva(1, rota1, 3);
        Reserva reserva2 = new Reserva(2, rota2, 2);

        Trem trem = new Trem(Arrays.asList(buenosAires, bragado, suipacha));
        trem.adicionarReserva(reserva1);
        trem.adicionarReserva(reserva2);

        double valorTotal = trem.valorTotal();
        System.out.println("Valor Total das Reservas: R$" + valorTotal);

        try {
            int quantVezesLujanVisitada = trem.quantVezesVisitada(lujan);
            System.out.println("Quantidade de vezes que Luján é visitada: " + quantVezesLujanVisitada);
        } catch (EstacaoNaoEncontradaException e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
