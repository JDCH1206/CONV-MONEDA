package com.JDCH.conversorMoneda.modulos;

public class ComunicacionAppAUsuario implements ComunicacionAppUsuario{
    String saludoInicio = """
            ¡Hola, estimado usuario! Bienvenido a nuestra aplicación 
            de conversión de monedas en tiempo real. Este aplicativo 
            utiliza datos actualizados de fuentes confiables a través 
            de una API para proporcionarte las tasas de cambio más 
            recientes entre diferentes monedas. 
            Estamos aquí para ayudarte con tus conversiones de manera 
            rápida y eficiente. ¡Es un placer atender tu solicitud!
            """;
    String monto = """
            Por favor indicanos el monto a converir:
            """;
    String menuSeleccion = """
            ********************************************************
            A continuación, te mostramos las opciones de conversión 
            disponibles en la aplicación. Por favor, selecciona la 
            moneda de origen y la moneda de destino para obtener el 
            tipo de cambio más actualizado:
            
            1)  Peso colombiano a Dólar
            2)  Dólar a Peso colombiano
            3)  Peso Colombiano a Euro
            4)  Euro a Peso colombiano
            5)  Peso Colombiano a Yen
            6)  Yen a Peso Colombiano
            7)  Yen a Dólar
            8)  Dólar a Yen
            9)  Euro a Dólar
            10) Dólar a Euro
            11) Yen a Euro
            12) Euro a Yen
            13) Salir
            
            ********************************************************
            """;
    String nombreArchivo = """
            Para que puedas tener un registro de tus conversiones, 
            por favor, indícanos un nombre para el archivo 
            (formato Json). Este archivo contendrá todas las 
            conversiones realizadas durante tu sesión, 
            además del número total de conversiones y el tiempo de 
            uso de la aplicación.
            """;
    String numeroDeConversiones = "Número de converiones realizadas: ";
    String despedida = """
            Ha sido un placer atender tu solicitud. Gracias por confiar en 
            nuestra app para tus conversiones de moneda.
            ¡Esperamos verte pronto nuevamente!
            Saludos :)
            """;

    @Override
    public void saludoInicial() {
        System.out.println(saludoInicio);
    }

    @Override
    public void montoAconvertir() {
        System.out.println(monto);
    }

    @Override
    public void menuSeleccionConversionMoneda() {
        System.out.println(menuSeleccion);
    }

    @Override
    public void nombreArchivo() {
        System.out.println(nombreArchivo);
    }

    @Override
    public void datosUsoApp() {
        System.out.println(numeroDeConversiones);
    }

    @Override
    public void mensajeDespedida() {
        System.out.println(despedida);
    }
}
