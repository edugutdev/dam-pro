package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class Numero {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        boolean iguales = igual(numero1,numero2);
        System.out.println("Ambos son iguales: "+iguales);
        int resultado = mayor(numero1,numero2);
        System.out.println("El numero mayor es: "+resultado);
        resultado = menor(numero1, numero2);
        System.out.println("El numero menor es: "+resultado);
    }
    static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    static int menor(int numero1, int numero2) {
        if (numero1 < numero2) {
            return numero1;
        }
        return numero2;
    }
    static boolean igual (int numero1, int numero2) {
        if (numero1 == numero2) {
            return true;
        }
        return false;
    }
    //numero 2345 = 14
    static int total(String numero) {
        return 0;
    }
}
