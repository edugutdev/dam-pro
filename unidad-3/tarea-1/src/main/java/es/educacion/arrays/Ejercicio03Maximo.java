package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    public static void main(String[] args) {
        int[] numeros = {4, 9, -2, 7, 9};
        int resultado = maximo(numeros);
        System.out.println("El máximo es = " + resultado);
    }

    /**
     * Devuelve el valor más alto de un array de enteros.
     * @param numeros int[] de enteros; no puede ser nulo ni estar vacío
     * @return int con el valor máximo del array
     * @throws IllegalArgumentException si el array es nulo o vacío
     */
    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El Array es nulo o vacío");
        }
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}
