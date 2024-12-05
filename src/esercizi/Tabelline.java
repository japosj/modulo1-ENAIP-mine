package esercizi;

import java.util.Arrays;

/*
Scrivete una funzione che dato in input due numeri n ed m,
crea un array lungo m che in ogni cella ha il valore di indice
della cella moltiplicato per n.
 */
public class Tabelline {

    public static int[] tabelline(int n, int m) {
        int[] myArray = new int[m];
        for (int i = 0; i < m; i++) {
            myArray[i] = i*n;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] result = tabelline(9,11);
        System.out.println(Arrays.toString(result));
    }
}
