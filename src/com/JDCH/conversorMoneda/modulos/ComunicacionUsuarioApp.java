package com.JDCH.conversorMoneda.modulos;

public interface ComunicacionUsuarioApp {
    String leerLinea ();
    int leerEntero ();
    double leerDouble ();
    void limpiarLinea ();
    void cerrar ();
}
