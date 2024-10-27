package com.JDCH.conversorMoneda.modulos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComunicacionUsuarioAApp implements ComunicacionUsuarioApp{

    Scanner teclado = new Scanner(System.in);

    @Override
    public String leerLinea() {
        return teclado.nextLine();
    }

    @Override
    public int leerEntero() {
        while (true) {
            try {
                return teclado.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor ingresa un número válido.");
                teclado.next();
            }
        }
    }

    @Override
    public double leerDouble() {
        while (true) {
            try {
                return teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Por favor ingresa un número válido.");
                teclado.next();
            }
        }
    }

    @Override
    public void limpiarLinea() {
        teclado.nextLine();
    }

    @Override
    public void cerrar() {
        teclado.close();
    }
}
