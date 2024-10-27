package com.JDCH.conversorMoneda.calculos;

import java.util.Map;

public interface CalculosConversion {
    double calculoConversion (String monedaDestino, Map<String, Double> tasa, double montoAconvertir);
}
