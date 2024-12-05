package esercizi;

/*
Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci,
nella quale ogni numero è
definito dalla somma dei due precedenti, eccetto i primi due che sono per definizione 0 e 1.
Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via. Assumete di iniziare da 0,
dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.

suggerimento: usate gli array

Test: fibonacci(45) deve stampare 1134903170

Fib(0) = 0
Fib(1) = 1
Fib(n) = Fib(n-1) + Fib(n-2)

 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n < 0) {
            System.out.println("sei un pollo dovevi scriverlo positivo");
            System.out.println("ma io te lo faccio comunque eheheheh");
            n = Math.abs(n);
        }
        if (n <= 1) return n;
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
