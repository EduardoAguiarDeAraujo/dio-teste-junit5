package dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Rebeca", LocalDateTime.of(2020,1,1, 15, 0, 0));
        Assertions.assertEquals(4, pessoa.getIdade());
    }
}
