package com.JDCH.conversorMoneda.principal;
import com.JDCH.conversorMoneda.calculos.Calculo;
import com.JDCH.conversorMoneda.modulos.*;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
public class PrincipalOptimizada {
    public static void main(String[] args) {
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
                        monedaOrigen = "COP";
                        monedaDestino = "USD";
                        break;
                    case 2:
                        monedaOrigen = "USD";
                        monedaDestino = "COP" ;
                        break;
                    case 3:
                        monedaOrigen = "COP";
                        monedaDestino = "EUR";
                        break;
                    case 4:
                        monedaOrigen = "EUR";
                        monedaDestino = "COP" ;
                        break;
                    case 5:
                        monedaOrigen = "COP";
                        monedaDestino = "JPY";
                        break;
                    case  6:
                        monedaOrigen = "JPY";
                        monedaDestino = "COP" ;
                        break;
                    case 7:
                        monedaOrigen = "JPY";
                        monedaDestino = "USD" ;
                        break;
                    case 8:
                        monedaOrigen = "USD";
                        monedaDestino = "JPY" ;
                        break;
                    case 9:
                        monedaOrigen = "EUR";
                        monedaDestino = "USD" ;
                        break;
                    case 10:
                        monedaOrigen = "USD";
                        monedaDestino = "EUR";
                        break;
                    case 11:
                        monedaOrigen = "JPY";
                        monedaDestino = "EUR" ;
                        break;
                    case 12:
                        monedaOrigen = "EUR";
                        monedaDestino = "JPY" ;
                        break;
                }
                comunicacion.montoAconvertir();
                monto = ingreso.leerDouble();
                tasasDeCambio = solicitar.buscarDatosApi(monedaOrigen);
                dato = calculo.calculoConversion(monedaDestino,tasasDeCambio,monto);
                System.out.println(dato);
                conversionesMoneda.add(dato);
                Instant fin = Instant.now();
                Duration duracion = Duration.between(inicio, fin);
                long tiempoEnMilisegundos = duracion.toMillis();
                ConversionesRealizadas conversiones = new ConversionesRealizadas(monedaOrigen,
                        monto,monedaDestino,dato,tiempoEnMilisegundos);
                datosConversiones.add(conversiones);
                System.out.println("Tiempo de conversión: " + tiempoEnMilisegundos + " milisegundos");
               // ConversionesRealizadas conversiones = new ConversionesRealizadas(monedaOrigen,
                //        monto,monedaDestino,dato);
              //  datosConversiones.add(conversiones);
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
        try {
            archivo.archivo(nombreArchivo, datosConversiones);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
