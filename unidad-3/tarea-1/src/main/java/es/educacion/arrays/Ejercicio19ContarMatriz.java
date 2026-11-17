package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio19ContarMatriz {
    private Ejercicio19ContarMatriz() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 4, 4}, {2}, {4, 3}};
        int frecuencia = contarEnMatriz(matriz, 4);
        System.out.println("El 4 aparece = " + frecuencia + " veces");
    }

    /**
     * Funcion que uenta cuántas veces aparece el valor
     * @param matriz int[][] de enteros; no puede ser nula ni contener filas nulas
     * @param objetivo valor que se busca
     * @return int con el número total de apariciones; 0 si la matriz está vacía
     */
    public static int contarEnMatriz(int[][] matriz, int objetivo) {
        if (matriz == null) {
            throw new IllegalArgumentException("La matriz es nula");
        }
        int frecuencia = 0;
        for (int[] fila : matriz) {
            if (fila == null) {
                throw new IllegalArgumentException("La matriz contiene una fila nula");
            }
            for (int valor : fila) {
                if (valor == objetivo) {
                    frecuencia++;
                }
            }
        }
        return frecuencia;
    }
}
