package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio15Documentar {
    private Ejercicio15Documentar() { }

    /**
     * Funcion que devuelve el número de elementos del array
     * @param numeros int[] de enteros; no puede ser nulo
     * @return int con la cantidad de elementos del array
     */
    public static int longitud(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        return numeros.length;
    }

    /**
     * Funcion que indica si el array contiene al menos un elemento
     * @param numeros int[] de enteros; no puede ser nulo
     * @return true si el array tiene uno o más elementos; false si está vacío
     */
    public static boolean tieneElementos(int[] numeros) {
        return longitud(numeros) > 0;
    }
}
