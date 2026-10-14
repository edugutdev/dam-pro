package org.ies.puerto;

import java.util.Scanner;

/**
 * @author Eduardo Gutiérrez
 * @version 1.0.0
 */

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        System.out.println("==== CONVERSOR DAM-PRO ====");
        System.out.println("Introduzca su nombre");
        int nombre = scanner.nextInt();
        System.out.println("Bienvenida/o "+nombre);

        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Kilómetros a millas");
        System.out.println("4. Salir");
        System.out.println("Selecciona una opción.");

    }
}