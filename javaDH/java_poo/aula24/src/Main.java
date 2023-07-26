public class Main {
    public static void main(String[] args) {
        Leilao leilao = new Leilao(100.0, "Item para leilão");

        Licitante licitante1 = new Licitante("Licitante 1", "Sobrenome 1", "ID1", 150.0);
        Licitante licitante2 = new Licitante("Licitante 2", "Sobrenome 2", "ID2", 120.0);
        Licitante licitante3 = new Licitante("Licitante 3", "Sobrenome 3", "ID3", 200.0);

        leilao.registrarLicitante(licitante1);
        leilao.registrarLicitante(licitante2);
        leilao.registrarLicitante(licitante3);

        leilao.setValor(110.0);

        System.out.println("Interagindo com o Licitante 1:");
        licitante1.setValorMaximo(130.0);
        leilao.setValor(120.0);

        System.out.println("Interagindo com o Licitante 2:");
        licitante2.setValorMaximo(140.0);
        leilao.setValor(130.0);

        Licitante vencedor = leilao.getVencedor();
        if (vencedor != null) {
            System.out.println("O vencedor do leilão é: " + vencedor.getNome());
        } else {
            System.out.println("Nenhum vencedor foi determinado.");
        }
    }
}
