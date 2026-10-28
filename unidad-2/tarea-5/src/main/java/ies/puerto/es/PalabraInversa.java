package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class PalabraInversa {

    public static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String sPalabra = teclado.nextLine();
        String sInvertida = reverse(sPalabra);
        System.out.println("Palabra invertida: "+sInvertida);

    }

    /**
     * Crea una palabra o texto invertida al original
     * @param palabra String Palabra/texto original
     * @return String Cadena invertida
     */
    static String reverse(String palabra) {
        StringBuilder resultado = new StringBuilder();
        if (palabra == null || palabra.isEmpty()) {
            return "";
        }
        //size / lenght |0| -> 8 - 1 = 7 -> 1
        //palabra = |a|l|m|e|n|d|r|a| -> |a|r|d|n|e|m|l|a|
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }
    static String reverse2(String palabra) {
        StringBuilder resultado = new StringBuilder(palabra);
        return resultado.reverse().toString();
    }
}
