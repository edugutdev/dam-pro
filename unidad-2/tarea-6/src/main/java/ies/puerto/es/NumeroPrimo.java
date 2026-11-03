package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        String numero = teclado.nextLine();
        System.out.println("Numero primo: "+esPrimo(numero));
        teclado.close();;
    }
    public static boolean esPrimo(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El texto debe de ser válido");
        }
        int n;
        try {
            n = Integer.parseInt(numero.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Numero mal formado");
        }
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}