package Main;

public interface Iconta {

   void sacar(double valor) throws SaldoInsuficienteException;

   void depositar(double valor);

   void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException;
   void imprimirExtrato();
}
