import java.util.Scanner;

import snack1.Studente;
import snack2.ContoBancario;
import snack3.RegistroStudenti;

public class App {
    public static void main(String[] args) throws Exception {

        // // snack 1
        // Studente st = new Studente("seniya", "thriwanka", 24);
        // st.info();

        // // snack 2
        // ContoBancario cb = new ContoBancario(200, 20, 70);
        // System.out.println(cb.deposito());
        // System.out.println(cb.prelevo());

        // snack 3
        RegistroStudenti rs = new RegistroStudenti();
        // Scanner input = new Scanner(System.in);
        // System.out.println("insert the new name you want to ");
        // String newName = input.nextLine();

        rs.aggiungiStudente();
        rs.allStudents();

    }
}
