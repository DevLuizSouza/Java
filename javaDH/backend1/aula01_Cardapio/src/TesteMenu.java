

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteMenu {

    @Test
    public void dadoMenuAdulto_quandoCalcularCusto_entaoCustoDeveSer25() {
        // GIVEN
        Menu menuAdulto = new MenuAdulto();

        // WHEN
        double custo = menuAdulto.calcularCusto();

        // THEN

        Assertions.assertEquals(25.0, custo, 0.001);
        System.out.println("--------------------------------");
    }

    @Test
    public void dadoMenuInfantil_quandoCalcularCusto_entaoCustoDeveSer15() {
        // GIVEN
        Menu menuInfantil = new MenuInfantil();

        // WHEN
        double custo = menuInfantil.calcularCusto();

        // THEN
        Assertions.assertEquals(11.0, custo, 0.10);
        System.out.println("--------------------------------");
    }

    @Test
    public void dadoMenuVegetariano_quandoCalcularCusto_entaoCustoDeveSer20() {
        // GIVEN
        Menu menuVegetariano = new MenuVegetariano();

        // WHEN
        double custo = menuVegetariano.calcularCusto();

        // THEN
        Assertions.assertEquals(20.2, custo, 0.001);
        System.out.println("--------------------------------");
    }
}
