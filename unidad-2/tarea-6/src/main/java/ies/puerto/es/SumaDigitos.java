package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class SumaDigitos {

    /**
     * Funcion que suma los digitos de un entero positivo indicado como texto
     * @param numero String entero positivo
     * @return int suma de los digitos
     */
    public static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede ser null ni estar vacio");
        }
        int resultado = 0;
        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if (caracter < '0' || caracter > '9') {
                throw new NumberFormatException("Caracter no valido: " + caracter);
            }
            resultado = resultado + (caracter - '0');
        }
        return resultado;
    }
}
