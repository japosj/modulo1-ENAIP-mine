package esercizi;

/*
Scrivete una funzione che dato un array di valori interi ne restituisce una copia
dove i numeri dispari sono stati moltiplicati per 2.
 */

import java.util.Arrays;

public class DispariPerDue {

    public static int[] dispariPerDue(int[] array) {
        // inizializzo l'array di ritorno con stessa lunghezza dell'input
        int[] result = new int[array.length];
        // mi scorro l'array in input
        for (int i = 0; i < array.length; i++) {
            // per ogni elemento, controllo se sia dispari
            if (array[i] % 2 != 0) {
                // se è dispari devo inserire nella stessa posizione nel nuovo array
                // il numero moltiplicato per due
                result[i] = array[i]*2;
            }
            else {
                // altrimenti copio il valore così com'è
                result[i] = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = { 4,8,15,16,23,42 };
        int[] risultato = dispariPerDue(input);
        System.out.println(Arrays.toString(risultato));
    }

}
