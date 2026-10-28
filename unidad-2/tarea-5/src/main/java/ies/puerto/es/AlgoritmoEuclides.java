package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class AlgoritmoEuclides {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        int resultado = calcularMCD(numero1, numero2);
        System.out.println("El Máximo Común Divisor es: "+resultado);
    }

    /**
     * Funcion que realiza
     * @param numero1
     * @param numero2
     * @return
     */
    static int calcularMCD(int numero1, int numero2) {
        int resultado = 0;

        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        while (numero2 != 0) {
            int resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }
        return numero1;

    }
}
