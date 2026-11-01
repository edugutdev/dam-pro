package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class InvertirCadena {

    /**
     * Funcion que invierte todos los caracteres de un texto, conservando espacios y mayusculas (sin usar StringBuilder.reverse())
     * @param texto String texto original
     * @return String texto invertido
     */
    public static String invertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }
        return invertido;
    }
}
