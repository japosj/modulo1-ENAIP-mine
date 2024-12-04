package esercizi;

import java.util.Arrays;

/*
Scrivete una funzione che calcoli il massimo valore compreso in un array,
senza utilizzare metodi di supporto.
 */
public class MassimoInArray {

    public static int massimoInArray(int[] array) {
        // dichiaro una variabile d'appoggio dove salvare il massimo locale,
        // e ci metto il primo elemento dell'array
        int max = array[0];
        // mi scorro tutto il resto dell'array in input
        for (int i = 1; i < array.length; i++) {
            // confronto l'i-esimo elemento con il massimo locale
            if (array[i] > max) {
                // se l'i-esimo è maggiore, sovrascrivo la variabile max
                max = array[i];
            }
        }
        return max;
    }

    public static int massimoInArraySorted(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static void main(String[] args) {
        int[] array = { 4,8,15,55,16,23,42 };
        System.out.println(massimoInArray(array));
        System.out.println(massimoInArraySorted(array));
    }

}
