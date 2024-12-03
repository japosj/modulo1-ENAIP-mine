package esempi;

public class Variables {

    public static void main(String[] args) {
        // le variabili di tipo primitivo contengono al loro interno il VALORE assegnato
        int x = 5;
        boolean b = true;
        char c = 'M';
        System.out.println("dentro x ci sta " + x);
        System.out.println("il booleano è: " + b);
        System.out.println("dentro il carattere ci sta: " + c);
        // le variabili che contengono oggetti cosa hanno al loro interno?
        Persona persona = new Persona();
        persona.nome = "pippo";
        System.out.println(persona);

        // il confronto tra due oggetti complessi anche se con stessi attributi
        // non ritorna true, poichè l'operatore == confronta il contenuto delle variabili
        int y = 5;
        System.out.println(x == y);
        Persona persona1 = new Persona();
        persona1.nome = "pippo";
        System.out.println(persona == persona1);
        System.out.println(persona);
        System.out.println(persona1);

        //
        int firstNumber = 7;
        int secondNumber = 3;
        int result = firstNumber / secondNumber;
        System.out.println(result); // stampa solo la parte intera poichè sto dividendo degli interi

        double resultDouble = firstNumber / secondNumber;
        System.out.println(resultDouble);
        // in questo caso stamperà 2.0 poichè effettua prima la divisione intera e poi viene
        // inserito in una variabile double
        double finalResult = (double) firstNumber / (double) secondNumber;
        System.out.println(finalResult);

        String stringFinalResult = String.valueOf(finalResult);
        System.out.println("la stringa di finalResult è " + stringFinalResult);

    }

}
