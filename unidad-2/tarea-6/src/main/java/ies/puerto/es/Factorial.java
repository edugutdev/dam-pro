package ies.puerto.es;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class Factorial {

    /**
     * Funcion que calcula el factorial de un entero entre 0 y 12
     * @param numero String entero entre 0 y 12
     * @return int factorial del numero
     */
    public static int calcularFactorial(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede ser null ni estar vacio");
        }
        int valor = Integer.parseInt(numero);
        if (valor < 0 || valor > 12) {
            throw new IllegalArgumentException("El numero debe estar entre 0 y 12");
        }
        int resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
