package snack3;

import java.util.Arrays;
import java.util.Scanner;

public class RegistroStudenti {

  private String[] studenti;

  // costruttore senza paramitri
  public RegistroStudenti() {
  }

  // getter and setter
  public String[] getStudenti() {
    return studenti;
  }

  public void setStudenti(String[] studenti) {
    this.studenti = studenti;
  }

  // agiunggere studenti al registro
  public void aggiungiStudente() {
    Scanner input = new Scanner(System.in);
    System.out.println("enter how many students you want to insert :  ");
    int numebr = input.nextInt();
    input.nextLine();

    studenti = new String[numebr];

    for (int i = 0; i < numebr; i++) {
      System.out.print("Enter name " + (i + 1) + ": ");
      studenti[i] = input.nextLine();
    }

  }

  // lista per stamapre i studenti
  public void allStudents() {
    for (String str : studenti) {
      System.out.println(str);
    }
  }

}
