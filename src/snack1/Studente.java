package snack1;

public class Studente {

  public String nome;
  public String cognome;
  public int eta;

  public Studente(String nome, String cognome, int eta) {
    this.nome = nome;
    this.cognome = cognome;
    this.eta = eta;
  }

  public void info() {
    System.out.println(nome + " " + cognome + " " + eta + " anni");
  }
}
