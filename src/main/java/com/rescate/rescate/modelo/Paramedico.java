package com.rescate.rescate.modelo;

public class Paramedico implements ActividadesRescate {

    private Rescate rescate;

    public Paramedico(Rescate rescate) {
        this.rescate = rescate;
    }

    @Override
    public String asistir(Rescate rescate) {
        return "El paramédico asistió a " + rescate.getPersona()
                + " en " + rescate.getLugar()
                + " durante la emergencia: " + rescate.getEmergencia() + ".";
    }

    @Override
    public String localizar(Rescate rescate) {
        return "El paramédico localizó a " + rescate.getPersona()
                + " en " + rescate.getLugar()
                + ". La emergencia es: " + rescate.getEmergencia() + ".";
    }

    @Override
    public String salvar(Rescate rescate) {
        return "El paramédico salvó a " + rescate.getPersona()
                + " durante la emergencia de " + rescate.getEmergencia()
                + " en " + rescate.getLugar() + ".";
    }

}