package Main;

public abstract class Conta implements Iconta {

  protected static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;

  public Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
  }

  @Override
  public void sacar(double valor) throws SaldoInsuficienteException {
    if (this.saldo < valor) {
      throw new SaldoInsuficienteException();
    }
    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void imprimirExtrato() {

  }

  @Override
  public void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException {
    if (this.saldo < valor) {
      throw new SaldoInsuficienteException();
    }
    this.sacar(valor);
    contaDestino.depositar(valor);
  }


  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  protected void imprimitInfosComuns() {
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Número: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  public void sacar() {

  }

  public void depositar() {

  }

  public void transferir(double valor) {

  }

}

