package com.rescate.rescate.modelo;

public class Rescate {

    private String lugar;
    private String emergencia;
    private String persona;
    private Integer valor;

    public Rescate(String lugar, String emergencia, String persona, Integer valor) {
        this.lugar = lugar;
        this.emergencia = emergencia;
        this.persona = persona;
        this.valor = valor;
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

    public Integer getValor() {
        return valor;
    }
}