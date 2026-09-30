package com.rescate.rescate.modelo;

import java.util.List;

public class Paramedico implements ActividadesRescate {

    private List<Rescate> rescates;
    private String nombre;

    public Paramedico(String nombre, List<Rescate> rescates) {
        this.nombre = nombre;
        this.rescates = rescates;
    }

    @Override
    public String localizar(List<Rescate> rescates) {

        if (rescates.isEmpty()) {
            return nombre + " no tiene rescates para localizar.";
        }

        String mensaje = "";

        for (Rescate rescate : rescates) {
            mensaje += nombre + " localizó a "
                    + rescate.getPersona()
                    + " en "
                    + rescate.getLugar()
                    + ". Emergencia: "
                    + rescate.getEmergencia()
                    + ". ";
        }

        return mensaje;
    }

    @Override
    public String salvar(List<Rescate> rescates) {

        if (rescates.isEmpty()) {
            return nombre + " no tiene rescates para salvar.";
        }

        String mensaje = "";

        for (Rescate rescate : rescates) {
            mensaje += nombre + " salvó a "
                    + rescate.getPersona()
                    + " en "
                    + rescate.getLugar()
                    + ". Emergencia: "
                    + rescate.getEmergencia()
                    + ". ";
        }

        return mensaje;
    }

    @Override
    public String asistir(List<Rescate> rescates) {

        if (rescates.isEmpty()) {
            return nombre + " no tiene rescates para asistir.";
        }

        String mensaje = "";

        for (Rescate rescate : rescates) {
            mensaje += nombre + " asistió a "
                    + rescate.getPersona()
                    + " en "
                    + rescate.getLugar()
                    + ". Emergencia: "
                    + rescate.getEmergencia()
                    + ". ";
        }

        return mensaje;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Rescate> getRescates() {
        return rescates;
    }

}