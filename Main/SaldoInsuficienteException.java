package Main;

public class SaldoInsuficienteException extends  Exception{

  public SaldoInsuficienteException() {
    super("Saldo insuficiente para realizar a operação.");
  }
}
