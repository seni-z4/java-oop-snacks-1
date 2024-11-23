package snack2;

public class ContoBancario {

  public int conto;
  public int saldo;
  public int soldi;

  public ContoBancario(int conto, int saldo, int soldi) {
    this.conto = conto;
    this.saldo = 0;
    this.soldi = soldi;
  }

  public int deposito() {
    this.conto += this.soldi;
    return conto;
  }

  public int prelevo() {
    this.conto -= this.soldi;
    return conto;
  }

}
