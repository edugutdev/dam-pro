package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }

    public static void main(String[] args) {
        int[] primero = {1, 4, 7};
        int[] segundo = {2, 3, 8, 9};
        int[] resultado = fusionar(primero, segundo);
        System.out.println("Array fusionado = " + Arrays.toString(resultado));
    }

      public static int[] fusionar(int[] primero, int[] segundo) {
        if (primero == null || segundo == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        int[] fusionado = new int[primero.length + segundo.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < primero.length && j < segundo.length) {
            if (primero[i] <= segundo[j]) {
                fusionado[k] = primero[i];
                i++;
            } else {
                fusionado[k] = segundo[j];
                j++;
            }
            k++;
        }
        while (i < primero.length) {
            fusionado[k] = primero[i];
            i++;
            k++;
        }
        while (j < segundo.length) {
            fusionado[k] = segundo[j];
            j++;
            k++;
        }
        return fusionado;
    }
}
