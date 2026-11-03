package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre el 0 y el 12: ");
        String numero = teclado.nextLine();
        System.out.println("Facrotial: "+calcularFactorial(numero));
    }
    public static int calcularFactorial(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El texto no debe ser nulo o vacio");
        }
        int n;
        try {
            n = Integer.parseInt(numero.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Numero mal formado");
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}