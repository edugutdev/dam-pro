package ies.puerto.es;

import java.util.Scanner;
/**
 * @author edugutdev
 * @version 1.0.0
 */
public class Factorial {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        int resultado = calcular(numero);
        System.out.println("Factorial: "+resultado);
    }

    /**
     * Calcula el factorial de un numero dado
     * @param numero int para el calculo del factorial
     * @return int con el resultado
     */
    static int calcular(int numero) {
        if (numero <= 1) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
