package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio18Transponer {
    private Ejercicio18Transponer() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int[][] resultado = transponer(matriz);
        System.out.println("Matriz transpuesta = " + Arrays.deepToString(resultado));
    }

    /**
     * @param matriz int[][] rectangular de enteros; no puede ser nula ni tener filas irregulares
     * @return int[][] nueva matriz transpuesta; 0x0 si la entrada es 0x0
     */
    public static int[][] transponer(int[][] matriz) {
        if (matriz == null) {
            throw new IllegalArgumentException("La matriz es nula");
        }
        int filas = matriz.length;
        if (filas == 0) {
            return new int[0][0];
        }
        int columnas = matriz[0].length;
        for (int[] fila : matriz) {
            if (fila == null || fila.length != columnas) {
                throw new IllegalArgumentException("La matriz es irregular");
            }
        }
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
}
