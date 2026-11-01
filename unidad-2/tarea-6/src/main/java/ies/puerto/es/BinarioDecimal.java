package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class BinarioDecimal {

    /**
     * Funcion que convierte una cadena de ceros y unos a decimal. Rechaza otros caracteres y los valores que no caben en un int
     * @param binario String numero binario
     * @return int valor decimal
     */
    public static int convertirBinario(String binario) {
        if (binario == null || binario.isEmpty()) {
            throw new IllegalArgumentException("El binario no puede ser null ni estar vacio");
        }
        int resultado = 0;
        for (int i = 0; i < binario.length(); i++) {
            char caracter = binario.charAt(i);
            if (caracter != '0' && caracter != '1') {
                throw new NumberFormatException("Caracter no binario: " + caracter);
            }
            int bit = caracter - '0';
            if (resultado > (Integer.MAX_VALUE - bit) / 2) {
                throw new NumberFormatException("El binario desborda un int: " + binario);
            }
            resultado = resultado * 2 + bit;
        }
        return resultado;
    }
}
