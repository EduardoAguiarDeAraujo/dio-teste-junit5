package dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 50);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 80));
    }
}