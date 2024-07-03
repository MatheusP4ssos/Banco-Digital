package Main;

public class ContaCorrente extends Conta {

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato do Conta Corrente ===");
    super.imprimitInfosComuns();
  }
}