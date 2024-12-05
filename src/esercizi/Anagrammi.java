package esercizi;

import java.util.Arrays;

/*
Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri
con le stesse frequenze. Ad esempio, gli anagrammi di CAT sono CAT,
ACT,TAC,TCA,ATC, e CTA. Date due stringhe a e b in input, stampare «anagrammi»
se sono anagrammi (case-insensitive), «non anagrammi» altrimenti.
 */
public class Anagrammi {

    public static void anagrammi(String a, String b) {
        // controllo se le stringhe hanno stessa lunghezza
        if (a.length() != b.length()) {
            System.out.println(a + " e " + b + " NON sono anagrammi");
            return; // esco dalla funzione
        }
        // definisco due array di caratteri uno per a e uno per b
        // rendendo entrambe le stringhe minuscole con lowerCase()
        char[] caratteriA = a.toLowerCase().toCharArray();
        char[] caratteriB = b.toLowerCase().toCharArray();
        Arrays.sort(caratteriA);
        Arrays.sort(caratteriB);
        if (Arrays.equals(caratteriA, caratteriB)) {
            System.out.println(a + " e " + b + " SONO anagrammi");
        }
        else System.out.println(a + " e " + b + " NON sono anagrammi");
    }

    public static void main(String[] args) {
        anagrammi("marco", "asroma");
        anagrammi("marco", "Ocram");
        anagrammi("ANNA", "nana");

    }
}
