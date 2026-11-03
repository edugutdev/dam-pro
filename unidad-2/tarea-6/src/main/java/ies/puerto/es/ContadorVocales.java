package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class ContadorVocales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String texto = teclado.nextLine();
        System.out.println("Vocales: "+contarVocales(texto));
    }

    public static int contarVocales(String texto) {
    if (texto == null) {
        throw new IllegalArgumentException("El texto no puede ser nulo");

    }
    String permitidas = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
    int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (permitidas.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}