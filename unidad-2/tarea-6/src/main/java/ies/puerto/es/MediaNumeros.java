package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class MediaNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numeros enteros separados por comas: ");
        String numeros = teclado.nextLine();
        System.out.println("Media de numeros: "+calcularMedia(numeros));
    }
    public static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("El texto no puede ser nulo");
        }
        String[] partes = numeros.split(",");
        if (partes.length == 0) {
            throw new IllegalArgumentException("No puede estar vacio");
        }
        double suma = 0.0;
        int contador = 0;
        for (String parte : partes) {
            String limpio = parte.trim();
            if (limpio.isEmpty()) {
                throw new IllegalArgumentException("Elemento vacío en la lista de números");
            }
            try {
                int valor = Integer.parseInt(limpio);
                suma += valor;
                contador++;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Numero mal formado");
            }
        }
        if (contador == 0) {
            throw new IllegalArgumentException("No hay numeros validos.");
        }
        return suma / contador;
    }
}