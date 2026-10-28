package ies.puerto.es;


import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class ClaveSecreta {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la palabra que desea transformar en clave:");
        String palabra = teclado.nextLine();
        String clave = generarClaveSegura(palabra);
        System.out.println("La clave es: " + clave);
    }

    /**
     * Remplaza las vocales por otros caracteres
     * @param sPalabra String
     * @return String
     */
    static String generarClaveSegura (String sPalabra) {
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()) {
            return "";
        }

        sPalabra = sPalabra.replace("a", "4");
        sPalabra = sPalabra.replace("e", "$");
        sPalabra = sPalabra.replace("i", "1");
        sPalabra = sPalabra.replace("o", "0");
        sPalabra = sPalabra.replace("u", "c");

        return sPalabra;
    }

}