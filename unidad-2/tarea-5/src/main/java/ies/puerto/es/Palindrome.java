package ies.puerto.es;


import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class Palindrome {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o frase a analizar");
        String sFrase = teclado.nextLine();
        boolean bPalindrome = esPalindrome(sFrase);
        System.out.println("La palabra/frase es palindrome = "+bPalindrome);
    }

    /**
     * Funcion que recibe una palabra o frase
     * @param frase
     * @return
     */
    static boolean esPalindrome(String frase) {
        if (frase == null || frase.isEmpty()) {
            return false;
        }

    frase = frase.toLowerCase();
    frase = frase.replace("", "");
    for (int i = 0; i < frase.length(); i++) {
        char letraIzquierda = frase.charAt(i);
        char letraDerecha = frase.charAt(frase.length()-1-i);
        if (letraIzquierda != letraDerecha) {
            return false;
        }
    }
        return false;
    }
}
