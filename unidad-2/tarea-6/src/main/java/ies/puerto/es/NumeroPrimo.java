package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class NumeroPrimo {

  
    /**
     * Funcion que decide si un numero recibido como texto es primo.
     * @param numero String entero a comprobar
     * @return true si es primo, false en caso contrario
     */
    public static boolean esPrimo(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede ser null ni estar vacio");
        }
        int valor = Integer.parseInt(numero);
        if (valor < 2) {
            return false;
        }
        for (long divisor = 2; divisor * divisor <= valor; divisor++) {
            if (valor % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
