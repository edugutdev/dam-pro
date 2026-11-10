package es.educacion.arrays;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public final class Ejercicio01Sumar {
    private Ejercicio01Sumar() { }

    public static void main(String[] args) {
        int [] elementos = new int[6]; // |0|0|0|0|0|
        elementos[0] = 7;
        elementos[1] = 8;
        elementos[2] = 2;
        elementos[3] = 3;
        elementos[4] = 414;
        elementos[5] = 280;
        int [] numeros = {7,8,2,3,414,280};

        int sumaElementos = sumar(elementos);
        System.out.println("La suma de elementos es = "+sumaElementos);
    }

    /**
     * Calcula la suma de un array
     * @param numeros int[] de enteros
     * @return int suma de todos los numeros
     */
    public static int sumar(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El Array es nulo o vacío");
        }
        int suma = 0;
        for (int numero:numeros) {
            suma = suma + numero;
        }
        return suma;
    }

}
