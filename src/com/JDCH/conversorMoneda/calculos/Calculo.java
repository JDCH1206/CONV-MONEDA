package com.JDCH.conversorMoneda.calculos;

import java.util.Map;

public class Calculo implements ICalculosConversion {
    @Override
    public double calculoConversion(String monedaDestino, Map<String, Double> tasa, double montoAconvertir) {
        Map<String, Double> tasasDeCambio = tasa;
        Double tasaDestino = tasasDeCambio.get(monedaDestino);
        double cambio = tasaDestino*montoAconvertir;
        return cambio;
    }
}
