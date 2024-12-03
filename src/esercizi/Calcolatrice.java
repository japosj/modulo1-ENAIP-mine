package esercizi;

import java.util.Scanner;

/*
Scrivere un metodo che chieda all'utente di inserire due numeri interi e di
inserire un'operazione tra le seguenti:
- somma
- sottrazione
- moltiplicazione
- divisione
- resto
e stampa a video il risultato dell'operazione scelta tra i due numeri
 */
public class Calcolatrice {

    public static void calcolatrice() {
        // dichiaro lo scanner per la tastiera
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci due numeri");
        System.out.println();
        // catturo dallo scanner i due numeri
        int primoNumero = Integer.parseInt(input.next());
        int secondoNumero = Integer.parseInt(input.next());
        System.out.println("Inserisci ora l'operazione: ");
        System.out.println("+ per la somma \n" +
                            "- per la sottrazione \n" +
                            "* per la moltiplicazione \n" +
                            "/ per la divisione \n" +
                            "% per il modulo");
        // catturo l'operatore scelto
        String operatore = input.next();
        // a seconda dell'input eseguo l'operazione
        if (operatore.equals("+")) {
            int somma = primoNumero + secondoNumero;
            System.out.println(primoNumero + " + " + secondoNumero + " = " + somma);
        } else if (operatore.equals("-")) {
            int sottrazione = primoNumero - secondoNumero;
            System.out.println(primoNumero + " - " + secondoNumero + " = " + sottrazione);
        } else if (operatore.equals("*")) {
            int mult = primoNumero * secondoNumero;
            System.out.println(primoNumero + " * " + secondoNumero + " = " + mult);
        } else if (operatore.equals("/")) {
            // faccio il casting a double per non perdere la parte decimale
            double divisione = (double) primoNumero / (double) secondoNumero;
            System.out.println(primoNumero + " / " + secondoNumero + " = " + divisione);
        } else if (operatore.equals("%")) {
            int resto = primoNumero % secondoNumero;
            System.out.println(primoNumero + " % " + secondoNumero + " = " + resto);
        } else {
            System.out.println("SEI UN FAGIANO! RIPROVA POLLO");
            calcolatrice();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        calcolatrice();
    }

}
