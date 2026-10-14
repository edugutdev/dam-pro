package org.ies.puerto;

import java.util.Scanner;

/**
 * @author Eduardo Gutiérrez
 * @version 1.0.0
 */

public class Tickets2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== CONVERSOR DAM-PRO ====");
        System.out.println("Introduzca su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenida/o "+nombre);

        int opcion = 0;
        int contadorConversion = 0;

        while (opcion != 4) {

            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    float kilometros;
                    System.out.println("Introduce los kilometros: ");
                    kilometros = scanner.nextFloat();

                    while (kilometros < 0) {
                        System.out.println("Error: La distancia no puede ser negativa.");
                        System.out.println("Introduce los kilometros: ");
                        kilometros = scanner.nextFloat();
                    }
                    float metros = kilometros * 1000;
                    System.out.println("Resultado: "+metros+" metros");
                    System.out.println("Conversión realizada correctamente.");
                    contadorConversion++;
                    break;

                case 2:
                    float metros2;
                    System.out.println("Introduce los metros: ");
                    metros2 = scanner.nextFloat();

                    while (metros2 < 0) {
                        System.out.println("Error: La distancia no puede ser negativa.");
                        System.out.println("Introduce los metros: ");
                        metros2 = scanner.nextFloat();
                    }
                    float centimetros = metros2 * 100;
                    System.out.println("Resultado: "+centimetros+" centimetros");
                    System.out.println("Conversión realizada correctamente.");
                    contadorConversion++;
                    break;

                case 3:
                    float kilometros2;
                    System.out.println("Introduce los kilometros: ");
                    kilometros2 = scanner.nextFloat();

                    while (kilometros2 < 0) {
                        System.out.println("Error: La distancia no puede ser negativa.");
                        System.out.println("Introduce los kilometros: ");
                        kilometros2 = scanner.nextFloat();
                    }
                    float millas = kilometros2 * 0.621371f;
                    System.out.println("Resultado: "+millas+" millas");
                    System.out.println("Conversión realizada correctamente.");
                    contadorConversion++;
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        System.out.println("Usuario: "+nombre);
        System.out.println("Conversiones realizadas: "+contadorConversion);
        System.out.println("Gracias por utilizar DAM-PRO");

        scanner.close();

    }
}