package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class InvertirCadena {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String texto = teclado.nextLine();
        System.out.println("Texto invertido: "+invertir(texto));
    }

    public static String invertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        char[] caracter = texto.toCharArray();
        char[] invertido = new char[caracter.length];
        for (int i = 0; i < caracter.length; i++) {
            invertido [i] = caracter[caracter.length-1-i];

        }
        return new String(invertido);

    }

}
