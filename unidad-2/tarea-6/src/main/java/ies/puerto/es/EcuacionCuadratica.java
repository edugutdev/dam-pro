package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class EcuacionCuadratica {

    private static final String CARACTERES_REALES = "0123456789+-.eE";


    public static double calcularDiscriminante(String a, String b, String c) {
        double coeficienteA = convertir(a);
        double coeficienteB = convertir(b);
        double coeficienteC = convertir(c);
        if (coeficienteA == 0) {
            throw new IllegalArgumentException("El coeficiente a debe ser distinto de cero");
        }
        double discriminante = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
        if (Double.isInfinite(discriminante) || Double.isNaN(discriminante)) {
            throw new IllegalArgumentException("El discriminante no es un valor finito");
        }
        return discriminante;
    }

    /**
     * Funcion que convierte un coeficiente de texto a double comprobando que sea finito
     * @param valor String coeficiente en texto
     * @return double coeficiente convertido
     */
    private static double convertir(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El coeficiente no puede ser null ni estar vacio");
        }
        valor = valor.trim();
        for (int i = 0; i < valor.length(); i++) {
            if (CARACTERES_REALES.indexOf(valor.charAt(i)) < 0) {
                throw new NumberFormatException("No es un numero real: " + valor);
            }
        }
        double numero = Double.parseDouble(valor);
        if (Double.isInfinite(numero) || Double.isNaN(numero)) {
            throw new NumberFormatException("El numero no es finito: " + valor);
        }
        return numero;
    }
}