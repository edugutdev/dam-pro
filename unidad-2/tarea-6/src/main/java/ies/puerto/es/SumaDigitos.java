package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class SumaDigitos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String numero = teclado.nextLine();
        System.out.println("Suma de digitos: "+sumarDigitos(numero));
    }

    public static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacio");

        }
        int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (!Character.isDigit(c)) {
                throw new NumberFormatException("El texto solo puede tener numeros");

            }
            suma += Character.getNumericValue(c);
        }
        return suma;
    }
}