package esercizi;

/*
Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa
che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
 */
public class ConteggioSecondi {

    public static String conteggioSecondi(int s) {
        if (s < 0) {
            return "Il numero di secondi non può essere negativo!";
        }
        int giorni = s / 86400;
        int restoOre = s % 86400;
        int ore = restoOre / 3600;
        int restoMinuti = restoOre % 3600;
        int minuti = restoMinuti / 60;
        int secondi = restoMinuti % 60;
        return s + " secondi corrispondono a: " +
                "Giorni: " + giorni + ", " +
                "Ore: " + ore + ", " +
                "Minuti: " + minuti + ", " +
                "Secondi: " + secondi + ", ";
    }

    public static void main(String[] args) {
        System.out.println(conteggioSecondi(150020));
    }
}
