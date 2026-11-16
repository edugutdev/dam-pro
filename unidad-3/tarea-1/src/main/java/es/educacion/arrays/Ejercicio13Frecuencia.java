package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio13Frecuencia {
    private Ejercicio13Frecuencia() { }

    public static void main(String[] args) {
        int[] numeros = {4,7,4,1,4,0};
        int frecuencia = frecuencia(numeros, 4);
        System.out.println("El 4 aparece "+frecuencia+" veces");
    }

    public static int frecuencia(int[] numeros, int objetivo) {
        if (numeros == null) {
            throw new IllegalArgumentException();
        }
        int frecuencia = 0;
        for (int numero:numeros) {
            if (numero == objetivo) {
                frecuencia++;
            }
        }
        return frecuencia;
    }
}
