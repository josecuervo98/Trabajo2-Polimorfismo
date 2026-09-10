package com.rescate.rescate.modelo;

public class Heroe implements ActividadesRescate {

    private Rescate rescate;

    public Heroe(Rescate rescate) {
        this.rescate = rescate;
    }

    @Override
    public String localizar(Rescate rescate) {
        return "El héroe localizó a " + rescate.getPersona()
                + " en " + rescate.getLugar()
                + ". La emergencia es: " + rescate.getEmergencia() + ".";
    }

    @Override
    public String salvar(Rescate rescate) {
        return "El héroe salvó a " + rescate.getPersona()
                + " durante la emergencia de " + rescate.getEmergencia()
                + " en " + rescate.getLugar() + ".";
    }

    @Override
    public String asistir(Rescate rescate) {
        return "El héroe asistió a " + rescate.getPersona()
                + " en " + rescate.getLugar()
                + " durante la emergencia: " + rescate.getEmergencia() + ".";
    }

}