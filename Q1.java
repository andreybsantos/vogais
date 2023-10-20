import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva uma frase: ");
        String frase = entrada.nextLine();

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char vzs = frase.charAt(i);
            if (vzs == 'a') {
                contA++;
            } else if (vzs == 'e') {
                contE++;
            } else if (vzs == 'i') {
                contI++;
            } else if (vzs == 'o') {
                contO++;
            } else if (vzs == 'u') {
                contU++;
            }
        }

        System.out.println("A frase que voce digitou: " + frase);
        System.out.println("A: tem " + contA + " na frase");
        System.out.println("E: aparece " + contE + " na frase");
        System.out.println("I: aparece " + contI + " na frase");
        System.out.println("O: aparece " + contO + " na frase");
        System.out.println("U: aparece " + contU + " na frase");

        entrada.close();
    }
}