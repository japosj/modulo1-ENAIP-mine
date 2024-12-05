package esercizi;

/*
Scrivete una funzione che data una matrice quadrata in input, restituisce la somma della diagonale da sinistra a destra.
Scrivete una seconda funzione che presa una matrice quadrata e un booleano a seconda del valore del booleano restituisce
o la somma della diagonale da sinistra a destra o quella da destra a sinistra.
Hint: usate la prima funzione nella seconda!
 */

public class DiagonaleMatrici {

    public static int diagonalley(int[][] matrice, boolean b) {
        return b ? diagonaleSD(matrice) : diagonaleDS(matrice);
    }

    public static int diagonaleSD(int[][] matrice) {
        int result = 0;
        for (int i = 0; i < matrice.length; i++) {
            result += matrice[i][i];
        }
        return result;
    }

    public static int diagonaleDS(int[][] matrice) {
        int result = 0;
        for (int i = 0; i < matrice.length; i++) {
            result += matrice[i][matrice.length-1-i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrice = {{1,7,0,-1},{-1,3,8,5},{2,0,-2,4},{6,1,5,9}};
        System.out.println(diagonalley(matrice, true));
        System.out.println(diagonalley(matrice, false));
    }

}
