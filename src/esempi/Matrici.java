package esempi;

import java.util.Arrays;

public class Matrici {

    public static void stampaElementiMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) { // prendo la riga
            for (int j = 0; j < matrice[i].length; j++) { //
                System.out.println(matrice[i][j]);
            }
        }
    }

    public static void stampaMatrice(int[][] matrice) {
        String myStampa = "[";
        for (int i = 0; i < matrice.length; i++) {
            myStampa += Arrays.toString(matrice[i]);
            myStampa = myStampa + ",\n";
        }
        myStampa = myStampa.substring(0,myStampa.length()-2);
        myStampa += "]";
        System.out.println(myStampa);
    }

    public static void main(String[] args) {
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
        stampaMatrice(matrice);
    }

}
