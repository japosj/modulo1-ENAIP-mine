package esercizi;

public class Fattoriale {

    public static int fattoriale(int n) {
        if (n < 0) {
            System.out.println("ERRORE! Non esiste il fattoriale di" +
                    "un numero negativo");
            return -1;
        } else if (n <= 1) {
            return 1;
        } else {
            // dichiaro una variabile dove calcolo il risultato
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("il fattoriale di " + 10 + " è " + fattoriale(10));
    }
}
