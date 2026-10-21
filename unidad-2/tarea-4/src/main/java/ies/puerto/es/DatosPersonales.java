package ies.puerto.es;

import java.util.Scanner;

/**
 * @author edugutdev
 * @version 1.0.0
 */
public class DatosPersonales {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String sNombre = teclado.nextLine();
        System.out.println("Introduce la edad: ");
        String sEdad = teclado.nextLine();
        System.out.println("Introduce la altura: ");
        String sAltura = teclado.nextLine();
        System.out.println("Introduce tu matricula: ");
        String sMatricula = teclado.nextLine();

        Double dAltura = convertirAltura(sAltura);
        int iEdad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean mayorEdad = esMayorDeEdad(iEdad);

        String ficha = formatearFicha(sNombre, dAltura, bMatricula, mayorEdad, iEdad);
        System.out.println(ficha);
    }

    /**
     * Funcion que transforma la edad en  string a entero
     * @param sEdad String que almacena la edad
     * @return int de la edad
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return 0;
        }
        int valor = Integer.valueOf(sEdad);
        return Integer.valueOf(sEdad);
    }

    /**
     * Funcion que trasnforma la altura a doble
     * @param sAltura String que almacena la altura
     * @return double de la altura
     */
    static Double convertirAltura(String sAltura) {
        if (sAltura == null || sAltura.isEmpty()) {
            return (double) 0;
        }
        return Double.valueOf(sAltura);
    }

    /**
     *
     * @param sMatricula
     * @return
     */
    static boolean convertirMatricula(String sMatricula) {
        if(sMatricula == null || sMatricula.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Funcion que comprueba si una edad es mayor de edad
     * @param iEdad integer con la edad de la persona
     * @return true/false
     */
    static boolean esMayorDeEdad(int iEdad) {
        return iEdad >= 18;
        }

    static Integer convertirEdadEnvolvente(int iEdad) {
        return Integer.valueOf(iEdad);
    }

    static int recuperarEdadPrimitiva (Integer iEdad) {
        if (iEdad == null) {
            return 0;
        }
        return iEdad.intValue();
    }

    /**
     * Funcion formatea la ficha
     *
     * @param sNombre    String nombre de la ficha
     * @param dAltura    double altura de la ficha
     * @param bMatricula boolean matricula de la ficha
     * @param mayorEdad  boolean mayor de edad de la ficha
     * @return
     */
    static String formatearFicha(String sNombre, Double dAltura,boolean bMatricula, boolean mayorEdad, int iEdad) {
        return "Ficha: "+sNombre+", edad: "+iEdad+", altura: "+dAltura+", matricula: "+bMatricula+", mayor de edad: "+mayorEdad;
    }
}





