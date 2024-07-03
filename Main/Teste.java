package Main;

public class Teste {

  public static void main(String[] args) throws SaldoInsuficienteException {
    Conta cc = new ContaCorrente();
    Conta poupanca = new ContaPoupança();

    cc.depositar(500);

   try {
     cc.transferir(200, poupanca);
   }catch (SaldoInsuficienteException e) {
     System.out.println(e.getMessage());
   }

   try{
     cc.sacar(1000);
   }catch (SaldoInsuficienteException e) {
     System.out.println(e.getMessage());
   }

    try {
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
    } catch (Exception e) {
      System.err.println("Erro ao imprimir extrato: " + e.getMessage());
    }
  }
}