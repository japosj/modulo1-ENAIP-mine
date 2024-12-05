package esempi;

import java.util.Random;

public class NumeriCasuali {

    public static void main(String[] args) {
        int estratto = (int) (Math.random()*100);
        System.out.println(estratto);

        Random random = new Random();
        int value = random.nextInt(90) + 1;
        System.out.println(value);
    }

}
