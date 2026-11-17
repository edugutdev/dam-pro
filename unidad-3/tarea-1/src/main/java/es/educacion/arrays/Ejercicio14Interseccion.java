package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio14Interseccion {
    private Ejercicio14Interseccion() { }

    public static void main(String[] args) {
        int[] primero = {1, 2, 2, 3, 5};
        int[] segundo = {2, 5, 5, 9};
        int[] resultado = interseccion(primero, segundo);
        System.out.println("Intersección = " + Arrays.toString(resultado));
    }

    /**
     * @param a int[] de enteros; no puede ser nulo
     * @param b int[] de enteros; no puede ser nulo
     * @return int[] nuevo con los valores comunes; vacío si no hay coincidencias
     */
    public static int[] interseccion(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        int[] comunes = new int[primero.length];
        int total = 0;
        for (int candidato : a) {
            if (contiene(segundo, b.length, candidato)
                    && !contiene(comunes, total, candidato)) {
                comunes[total] = candidato;
                total++;
            }
        }
        return Arrays.copyOf(comunes, total);
    }

    /**
     * @param valores int[] donde buscar
     * @param limite  número de posiciones a revisar
     * @param buscado valor que se busca
     * @return true si el valor aparece en esas posiciones; false en otro caso
     */
    private static boolean contiene(int[] valores, int limite, int buscado) {
        for (int i = 0; i < limite; i++) {
            if (valores[i] == buscado) {
                return true;
            }
        }
        return false;
    }
}
