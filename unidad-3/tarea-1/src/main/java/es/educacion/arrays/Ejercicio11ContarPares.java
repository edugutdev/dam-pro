package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio11ContarPares {
    private Ejercicio11ContarPares() { }

    public static void main(String[] args) {
        int[] numeros = {1,2,6,7,8,10,11,-2};
        int pares = contarPares(numeros);
        System.out.println("Numero de pares = "+pares);
    }

    /**
     * Funcion que cuenta valores divisibles entre dos
     * @param numeros int de enteros
     * @return int de la cantidad de valores pares
     */
    public static int contarPares(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int pares = 0;
        for (int numero:numeros) {
            if (numero %2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}
