package com.JDCH.conversorMoneda.modulos;

public class ConversionesRealizadas {
    private String monedaOrigen;
    private double montoMonedaOrigen;
    private String monedaDestino;
    private double montoMonedaDestino;
    private long tiempoEnMilisegundos;

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public double getMontoMonedaOrigen() {
        return montoMonedaOrigen;
    }

    public void setMontoMonedaOrigen(double montoMonedaOrigen) {
        this.montoMonedaOrigen = montoMonedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getMontoMonedaDestino() {
        return montoMonedaDestino;
    }

    public void setMontoMonedaDestino(double montoMonedaDestino) {
        this.montoMonedaDestino = montoMonedaDestino;
    }

    public long getTiempoEnMilisegundos() {
        return tiempoEnMilisegundos;
    }

    public void setTiempoEnMilisegundos(long tiempoEnMilisegundos) {
        this.tiempoEnMilisegundos = tiempoEnMilisegundos;
    }

    public ConversionesRealizadas(String monedaOrigen,
                                  double montoMonedaOrigen,
                                  String monedaDestino,
                                  double montoMonedaDestino,
                                  long tiempoEnMilisegundos) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.montoMonedaOrigen = montoMonedaOrigen;
        this.montoMonedaDestino = montoMonedaDestino;
        this.tiempoEnMilisegundos = tiempoEnMilisegundos;
    }

    @Override
    public String toString() {
        return "[Conversión " +
                "moneda Origen = " + monedaOrigen  +
                " monto Moneda Origen = " + montoMonedaOrigen +
                " moneda Destino = " + monedaDestino +
                " monto Moneda Destino = " + montoMonedaDestino + "]";
    }
}
