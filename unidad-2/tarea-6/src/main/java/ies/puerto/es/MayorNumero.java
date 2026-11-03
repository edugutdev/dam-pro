package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class MayorNumero {

    /**
     * Funcion que obtiene el mayor entero de una lista
     * @param numeros String lista de enteros separados por comas
     * @return int el mayor de los numeros
     */
    public static int obtenerMayor(String numeros) {
        if (numeros == null || numeros.isBlank()) {
            throw new IllegalArgumentException("La lista no puede ser null ni estar vacia");
        }
        String[] elementos = numeros.split(",", -1);
        int mayor = Integer.parseInt(elementos[0].trim());
        for (int i = 1; i < elementos.length; i++) {
            int numero = Integer.parseInt(elementos[i].trim());
            mayor = Math.max(mayor, numero);
        }
        return mayor;
    }
}