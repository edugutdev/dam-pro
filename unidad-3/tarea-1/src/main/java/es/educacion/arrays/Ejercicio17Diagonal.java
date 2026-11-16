package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }

    public static void main(String[] args) {
        int[][] matriz ={{1,2,3}, {3,2,1}, {4,4,4}};
        int suma;
        suma = sumarDiagonal(matriz);
        System.out.println("Suma de la diagonal = "+suma);
    }

    /**
     * Funcion que suma elementos de una diagonal
     * @param matriz int[][] cuadrada de enteros
     * @return int con la suma de la diagonal
     */
    public static int sumarDiagonal(int[][] matriz) throws IllegalArgumentException {
        if (matriz == null) {
            throw new IllegalArgumentException();
        }
        int n = matriz.length;
        for (int[] fila:matriz) {
            if (fila == null || fila.length != n) {
                throw new IllegalArgumentException();
            }
        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
}
