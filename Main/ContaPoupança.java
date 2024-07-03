package Main;

public class ContaPoupança extends Conta {

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato do Conta Poupança ===");
    imprimitInfosComuns();
  }
}
