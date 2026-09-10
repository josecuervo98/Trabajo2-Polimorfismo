package com.rescate.rescate.modelo;

public class Rescate {

    private String lugar;
    private String emergencia;
    private String persona;

    public Rescate(String lugar, String emergencia, String persona) {
        this.lugar = lugar;
        this.emergencia = emergencia;
        this.persona = persona;
    }

    public String getLugar() {
        return lugar;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public String getPersona() {
        return persona;
    }
}