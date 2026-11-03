package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class MediaNumeros {

    /**
     * Funcion que calcula la media de una lista
     * @param numeros String lista de enteros separados por comas
     * @return double media de los numeros
     */
    public static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isBlank()) {
            throw new IllegalArgumentException("La lista no puede ser null ni estar vacia");
        }
        String[] elementos = numeros.split(",", -1);
        long suma = 0;
        for (int i = 0; i < elementos.length; i++) {
            suma = suma + Integer.parseInt(elementos[i].trim());
        }
        return (double) suma / elementos.length;
    }
}