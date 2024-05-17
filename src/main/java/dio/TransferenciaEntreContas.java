
package dio;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if(valor > contaOrigem.getSaldo()) {
            throw new IllegalArgumentException("Saldo deve ser maior que o valor");
        }

        contaDestino.lancaCredito(valor);
        contaOrigem.lancaDebito(valor);
    }
}
