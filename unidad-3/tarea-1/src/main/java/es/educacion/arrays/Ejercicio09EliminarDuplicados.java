package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    public static void main(String[] args) {
        int[] numeros = {3, 1, 3, 2, 1, 3};
        int[] resultado = eliminarDuplicados(numeros);
        System.out.println("Sin duplicados = " + Arrays.toString(resultado));
    }

 
    public static int[] eliminarDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        int[] sinDuplicados = new int[numeros.length];
        int total = 0;
        for (int numero : numeros) {
            boolean yaExiste = false;
            for (int i = 0; i < total; i++) {
                if (sinDuplicados[i] == numero) {
                    yaExiste = true;
                    break;
                }
            }
            if (!yaExiste) {
                sinDuplicados[total] = numero;
                total++;
            }
        }
        return Arrays.copyOf(sinDuplicados, total);
    }
}
