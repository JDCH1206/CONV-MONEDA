package com.JDCH.conversorMoneda.modulos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class SolicitarDatosApi implements BuscarenApi{
    Gson gson = new GsonBuilder().
            setPrettyPrinting().create();
    @Override
    public Map<String, Double> buscarDatosApi(String moneda) {
        String direccion ="https://v6.exchangerate-api.com/v6/6ab58a785b2fd5ad3a5d0878/latest/" + moneda ;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        Monedas monedas = gson.fromJson(response.body(), Monedas.class);
        return monedas.conversion_rates();
    }
}
