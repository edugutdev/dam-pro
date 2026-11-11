package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    public static void main(String[] args) {
        int[] numeros = {5, -1, 3, 3, 0};
        int[] resultado = ordenar(numeros);
        System.out.println("El array ordenado es = " + Arrays.toString(resultado));
    }

    /**
     *
     * @param numeros int[] de enteros; no puede ser nulo
     * @return int[] nuevo con los elementos ordenados; vacío si la entrada está vacía
     * @throws IllegalArgumentException si el array es nulo
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        int[] ordenado = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ordenado);
        return ordenado;
    }
}
