package com.JDCH.conversorMoneda.modulos;

public interface IComunicacionUsuarioApp {
    String leerLinea ();
    int leerEntero ();
    double leerDouble ();
    void limpiarLinea ();
    void cerrar ();
}
