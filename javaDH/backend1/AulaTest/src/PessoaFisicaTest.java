import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;

class PessoaFisicaTest {

    //GIVEN WHEN THEN
    //DADO UM CENÁRIO, QUANDO, ENTÃO


    @Test
    @DisplayName("DADO UMA PESSOA DE 10 ANOS, QUANDO VALIDAMOS IDADE, RETORNA FALSE")
    public void dadaUmaPessoaCom10Anos_quandoValidamosIdade_entaoRetornarMenorDe18() {
        //dado
        PessoaFisica pessoaFisica = new PessoaFisica("Gabriel", 10);
        //quando
        boolean isMaiorQue18Anos = pessoaFisica.isMaiorDe18Anos();
        //então
        Assertions.assertFalse(isMaiorQue18Anos);
    }


    @Test
    @DisplayName("DADO UMA PESSOA DE 20 ANOS, QUANDO VALIDAMOS IDADE, RETORNA FALSE")
    public void dadaUmaPessoaCom20Anos_quandoValidamosIdade_entaoRetornarMenorDe18() {
        //dado
        String nome = "Gabriel Rodrigues";
        LocalDate dataDeNascimento = LocalDate.of(1999, Month.JULY, 8);
        PessoaFisica pessoaFisica = new PessoaFisica(nome, dataDeNascimento);
        //quando
        boolean isMaiorQue18Anos = pessoaFisica.isMaiorDe18Anos();
        //então
        Assertions.assertTrue(isMaiorQue18Anos);
        Assertions.assertEquals(nome, pessoaFisica.getNome());
        Assertions.assertEquals(dataDeNascimento, pessoaFisica.getDataDeNascimento());
    }

}