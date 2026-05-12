package com.sanosysalvos.ms.motor.coincidencias.factory;

public class AlertaExtravio implements Alerta {
    @Override
    public String getTipo() {
        return "Extravío";
    }
}
