package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] resultado = copiarRango(numeros, 1, 4);
        System.out.println("El rango copiado es = " + Arrays.toString(resultado));
    }

    
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {
        if (numeros == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        if (inicio < 0 || fin > numeros.length || inicio > fin) {
            throw new IllegalArgumentException("Intervalo no válido");
        }
        return Arrays.copyOfRange(numeros, inicio, fin);
    }
}
