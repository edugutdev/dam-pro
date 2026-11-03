package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class ContadorVocales {


    private static final String VOCALES = "aeiou\u00e1\u00e9\u00ed\u00f3\u00fa\u00fc";

    /**
     * Funcion que cuenta las vocales de un texto
     * @param texto String texto donde se cuentan las vocales
     * @return int numero de vocales
     */
    public static int contarVocales(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        int resultado = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (VOCALES.indexOf(caracter) >= 0) {
                resultado = resultado + 1;
            }
        }
        return resultado;
    }
}