package com.JDCH.conversorMoneda.calculos;

import java.util.Map;

public interface ICalculosConversion {
    double calculoConversion (String monedaDestino, Map<String, Double> tasa, double montoAconvertir);
}
