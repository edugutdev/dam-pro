package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] resultado = invertir(numeros);
        System.out.println("El array invertido es = " + java.util.Arrays.toString(resultado));
    }

    /**
     * Crea un nuevo array con los mismos elementos en orden inverso.
     * @param numeros int[] de enteros; no puede ser nulo
     * @return int[] nuevo con los elementos invertidos; vacío si la entrada está vacía
     * @throws IllegalArgumentException si el array es nulo
     */
    public static int[] invertir(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El Array es nulo");
        }
        int[] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        return invertido;
    }
}
