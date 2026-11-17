package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio20RachaCreciente {
    private Ejercicio20RachaCreciente() { }

    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 4, 6, 7, 8, 2};
        int racha = mayorRachaCreciente(numeros);
        System.out.println("La mayor racha creciente = " + racha);
    }

    /**
     * @param numeros int[] de enteros; no puede ser nulo
     * @return int con la longitud de la mayor racha estrictamente creciente; 0 si el array está vacío
     */
    public static int mayorRachaCreciente(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        if (numeros.length == 0) {
            return 0;
        }
        int mejor = 1;
        int actual = 1;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[i - 1]) {
                actual++;
            } else {
                actual = 1;
            }
            mejor = Math.max(mejor, actual);
        }
        return mejor;
    }
}
