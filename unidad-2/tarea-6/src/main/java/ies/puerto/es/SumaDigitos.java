package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class SumaDigitos {

    public static void main(String[] args) {

    }

    public static int sumarDigitos(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacio");

        }
        int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (!Character.isDigit(c)) {
                throw new NumberFormatException("El texto solo puede tener numeros");

            }
            suma += Character.getNumericValue(c);
        }
        return suma;
    }
}