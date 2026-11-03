package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class MayorNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numeros enteros: ");
        String numeros = teclado.nextLine();
        System.out.println("Mayor numero: "+obtenerMayor(numeros));

    }

    public static int obtenerMayor(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacio");
        }
        String [] partes = numeros.split(",");
        int mayor = Integer.MIN_VALUE;
        boolean primero = true;
        for (String parte : partes) {
            String limpio = parte.trim();
            if (limpio.isEmpty()) {
                continue;
            }
            int valor = Integer.parseInt(limpio);
            if (primero || valor > mayor) {
                mayor = valor;
                primero = false;
            }
        }

        if (primero) {
            throw new IllegalArgumentException("No hay numeros válidos.");
        }
        return mayor;
    }
}