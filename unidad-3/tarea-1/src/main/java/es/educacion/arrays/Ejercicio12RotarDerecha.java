package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio12RotarDerecha {
    private Ejercicio12RotarDerecha() { }

    public static void main(String[] args) {
        int[] numeros = {5,2,7,3};
        int[] resultado = rotar(numeros,2);
        System.out.println("Rotado: "+ Arrays.toString(resultado));
    }

    /**
     * @param numeros int[] de enteros
     * @param posiciones numero de posiciones a rotar
     * @return
     */
    public static int[] rotar(int[] numeros, int posiciones) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        if (posiciones < 0) {
            throw new IllegalArgumentException();
        }
        int[] rotado = new int[numeros.length];
        if (numeros.length == 0) {
            return rotado;
        }
        int paso = posiciones % numeros.length;
        for (int i = 0; i < numeros.length; i++) {
            rotado[(i+paso) % numeros.length] = numeros[i];
        }
        return rotado;
    }
}
