package esempi;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        String[] parole = new String[5];
        System.out.println(Arrays.toString(parole));

        parole[1] = "Java";
        System.out.println(Arrays.toString(parole));

        parole[2] = "pippo";
        System.out.println(Arrays.toString(parole));

        int[] numeri = { 4,8,15,16,23,42 };
        System.out.println(Arrays.toString(numeri));
    }

}
