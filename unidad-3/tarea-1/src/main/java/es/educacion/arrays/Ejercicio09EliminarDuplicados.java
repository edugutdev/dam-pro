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
        System.out.println("Eliminar duplicados = " + Arrays.toString(resultado));
    }

 
    public static int[] eliminarDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        int[] eliminarDuplicados = new int[numeros.length];
        int total = 0;
        for (int numero : numeros) {
            boolean yaExiste = false;
            for (int i = 0; i < total; i++) {
                if (eliminarDuplicados[i] == numero) {
                    yaExiste = true;
                    break;
                }
            }
            if (!yaExiste) {
                eliminarDuplicados[total] = numero;
                total++;
            }
        }
        return Arrays.copyOf(eliminarDuplicados, total);
    }
}
