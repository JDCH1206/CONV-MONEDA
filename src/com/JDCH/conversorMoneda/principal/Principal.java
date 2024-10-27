package com.JDCH.conversorMoneda.principal;

import com.JDCH.conversorMoneda.calculos.Calculo;
import com.JDCH.conversorMoneda.modulos.*;

import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Principal {
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        double monto = 0;
        String monedaOrigen = "";
        String monedaDestino = "";
        double dato = 0;
        int numeroDeConversiones = 0;
        ArrayList<Integer> validOptions = new ArrayList<>
                (Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        Map<String, Double> tasasDeCambio;
        ArrayList<Double> conversionesMoneda = new ArrayList<>();
        ArrayList <ConversionesRealizadas> datosConversiones = new ArrayList<>();
        ComunicacionAppAUsuario comunicacion = new ComunicacionAppAUsuario();
        ComunicacionUsuarioAApp ingreso = new ComunicacionUsuarioAApp();
        Calculo calculo = new Calculo();

        SolicitarDatosApi solicitar =new SolicitarDatosApi();
        comunicacion.saludoInicial();
        while (true){
            comunicacion.menuSeleccionConversionMoneda();
            opcion = ingreso.leerEntero();
            if (validOptions.contains(opcion)) {
                if (opcion == 13) {
                    comunicacion.mensajeDespedida();
                    break;
                }
                Instant inicio = Instant.now();
                switch (opcion){
                    case 1:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "COP";
                        monedaDestino = "USD";
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        conversionesMoneda.add(dato);
                        break;
                    case 2:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "USD";
                        monedaDestino = "COP" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        conversionesMoneda.add(dato);
                        break;
                    case 3:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "COP";
                        monedaDestino = "EUR";
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 4:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "EUR";
                        monedaDestino = "COP" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 5:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "COP";
                        monedaDestino = "JPY";
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case  6:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "JPY";
                        monedaDestino = "COP" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 7:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "JPY";
                        monedaDestino = "USD" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 8:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "USD";
                        monedaDestino = "JPY" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 9:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "EUR";
                        monedaDestino = "USD" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 10:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "USD";
                        monedaDestino = "EUR";
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 11:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "JPY";
                        monedaDestino = "EUR" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                    case 12:
                        comunicacion.montoAconvertir();
                        monto = ingreso.leerDouble();
                        monedaOrigen = "EUR";
                        monedaDestino = "JPY" ;
                        tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                        dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                        System.out.println(dato);
                        break;
                }

                Instant fin = Instant.now();
                Duration duracion = Duration.between(inicio, fin);
                long tiempoEnMilisegundos = duracion.toMillis();
                ConversionesRealizadas conversiones = new ConversionesRealizadas(monedaOrigen,
                        monto,monedaDestino,dato,tiempoEnMilisegundos);
                datosConversiones.add(conversiones);
                System.out.println("Tiempo de conversión: " + tiempoEnMilisegundos + " milisegundos");
            }else {
                System.err.println("El valor no es valido");
            }
            numeroDeConversiones ++;

        }
        System.out.println(numeroDeConversiones);
        System.out.println(conversionesMoneda);
        System.out.println(datosConversiones);
        ingreso.limpiarLinea();
        comunicacion.nombreArchivo();
        String nombreArchivo = ingreso.leerLinea();
        CrearArchivo archivo = new CrearEscribirArchivo();
        archivo.archivo(nombreArchivo, datosConversiones);

    }
}
