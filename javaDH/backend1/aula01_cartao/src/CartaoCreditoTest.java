import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartaoCreditoTest {




    @Test
    @DisplayName("DADO UM CARTAO DE CREDITO COM TAMANHO DE 19 DIGITOS, RETORNA TRUE")
    public void testValidarNumeroCartaoCredito(){
        CartaoCredito cartaocretido = new CartaoCredito("Luiz de Souza", "1234-5678-9112-1238");
        boolean isTem19Caracteres = cartaocretido.isTem19Caracteres();
        Assertions.assertTrue(isTem19Caracteres);


    }

    @Test
    @DisplayName("DADO UM CARTAO DE CREDITO COM TAMANHO DIFERENTE de 20 DIGITOS, RETORNA FALSE")

    public void testValidarNumeroCartaoCreditoInvalido(){

    }



}
