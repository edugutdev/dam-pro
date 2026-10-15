package org.ies.puerto;

import java.util.Scanner;

/**
 * @author Eduardo Gutiérrez
 * @version 1.0.0
 */

public class ahorro {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SIMULADOR DE AHORRO");
        System.out.println("Introduzca su nombre");
        String nombre = scanner.nextLine();
        System.out.println("¿Cuanto dinero tiene ahorrado?");
        float ahorroInicial = scanner.nextFloat();
        scanner.nextLine();

        while (ahorroInicial < 0) {

            System.out.println("El ahorro inicial no puede ser negativo. ¿Cuanto dinero tiene ahorrado?");
            ahorroInicial = scanner.nextFloat();
            scanner.nextLine();
        }

        System.out.println("Hola, " + nombre +);
        float totalAportado = 0.0f;
        int contadorAportacion = 0;
        String respuesta;

        do {
            System.out.println("Introduce una cantidad para ahorrar: ");
            float aportacion = scanner.nextFloat();
            scanner.nextLine();

            while (aportacion <= 0) {
                System.out.println("La cantidad debe ser mayor que cero. Introduce una cantidad para ahorrar: ");
                aportacion = scanner.nextFloat();
                scanner.nextLine();
            }
            totalAportado += aportacion;
            contadorAportacion++;
            float ahorroActual = ahorroInicial + totalAportado;

            System.out.println("Aportacion registrada. Aportacion actual: " + ahorroActual + " euros");
            System.out.println("¿Desea hacer otra aportacion? (S/N");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));

        float ahorroFinal = ahorroInicial + totalAportado;

        System.out.println("\nRESUMEN DEL AHORRO");
        System.out.println("Usuario: " + nombre);
        System.out.println("Ahorro inicial: " + ahorroInicial + " euros");
        System.out.println("Aportaciones realizadas: " + contadorAportacion);
        System.out.println("Total aportado: " + totalAportado + " euros");
        System.out.println("Ahorro final: " + ahorroFinal + " euros");

    }
