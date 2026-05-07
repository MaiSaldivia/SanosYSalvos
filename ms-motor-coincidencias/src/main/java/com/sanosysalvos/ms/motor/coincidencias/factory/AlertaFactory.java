package com.sanosysalvos.ms.motor.coincidencias.factory;

public class AlertaFactory {
    public Alerta crearAlerta(String tipo) {
        if ("Hallazgo".equalsIgnoreCase(tipo)) {
            return new AlertaHallazgo();
        } else if ("Extravío".equalsIgnoreCase(tipo)) {
            return new AlertaExtravio();
        }
        return null;
    }
}
