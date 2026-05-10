package com.sanosysalvos.ms.motor.coincidencias.factory;

public class AlertaHallazgo implements Alerta {
    @Override
    public String getTipo() {
        return "Hallazgo";
    }
}
