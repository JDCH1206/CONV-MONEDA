package com.JDCH.conversorMoneda.modulos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CrearEscribirArchivo implements ICrearArchivo {
    @Override
    public void archivo(String file, ArrayList lista) throws IOException {
        FileWriter archivo = new FileWriter(file+".Json");
        Gson gson = new GsonBuilder().
                setPrettyPrinting().create();

        archivo.write(gson.toJson(lista));

        archivo.close();
    }
}
