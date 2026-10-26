package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class GestorCalificaciones {

    static int convertirNumeroNota(String sNumero) {
        int numero = 0;
        if(sNumero == null || sNumero.isEmpty()) {
            return 0;
        }

        //return Integer.parseInt(sNumero);
        numero == Integer.parseInt(sNumero);
        return numero;
    }

    static double convertirNota(String sNumero) {
        double numero = 0;

        if (sNumero == null || sNumero.isEmpty()) {
            return 0;
        }
        numero = Double.parseDouble(sNumero);
        return numero;
    }
    static boolean esNotaValida(Double dNumero) {

        if (dNumero == null) {
            return false;
        }
        if (dNumero < 0 || dNumero > 10) {
            return false;
        }

        return true;
    }


}
