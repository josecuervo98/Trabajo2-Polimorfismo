package com.rescate.rescate.repositories;

import com.rescate.rescate.modelo.*;
import java.util.List;

public class RepositorioRescates {

    Rescate rescate1 = new Rescate(
            "Parque Arví",
            "Accidente",
            "Carlos",
            10
    );

    Rescate rescate2 = new Rescate(
            "Estación Industriales",
            "Incendio",
            "María",
            20
    );

    Rescate rescate3 = new Rescate(
            "Cerro El Volador",
            "Persona perdida",
            "Andrés",
            30
    );

    Rescate rescate4 = new Rescate(
            "Plaza Mayor",
            "Emergencia médica",
            "Juan",
            40
    );

    Rescate rescate5 = new Rescate(
            "Pueblito Paisa",
            "Accidente",
            "Laura",
            50
    );

    Rescate rescate6 = new Rescate(
            "Parque Norte",
            "Incendio",
            "Pedro",
            60
    );


    List<Rescate> lista0 = List.of();

    List<Rescate> lista1 = List.of(
            rescate1
    );

    List<Rescate> lista2 = List.of(
            rescate1,
            rescate2
    );

    List<Rescate> lista3 = List.of(
            rescate1,
            rescate2,
            rescate3
    );

    List<Rescate> lista4 = List.of(
            rescate1,
            rescate2,
            rescate3,
            rescate4
    );

    List<Rescate> lista5 = List.of(
            rescate1,
            rescate2,
            rescate3,
            rescate4,
            rescate5
    );


    public ActividadesRescate objeto1 = new Bombero("Bombero 1", lista0);
    public ActividadesRescate objeto2 = new Bombero("Bombero 2", lista1);
    public ActividadesRescate objeto3 = new Bombero("Bombero 3", lista2);
    public ActividadesRescate objeto4 = new Bombero("Bombero 4", lista3);

    public ActividadesRescate objeto5 = new Paramedico("Paramedico 1", lista4);
    public ActividadesRescate objeto6 = new Paramedico("Paramedico 2", lista5);
    public ActividadesRescate objeto7 = new Paramedico("Paramedico 3", lista1);
    public ActividadesRescate objeto8 = new Paramedico("Paramedico 4", lista2);

    public ActividadesRescate objeto9 = new Heroe("Heroe 1", lista3);
    public ActividadesRescate objeto10 = new Heroe("Heroe 2", lista4);
    public ActividadesRescate objeto11 = new Heroe("Heroe 3", lista5);
    public ActividadesRescate objeto12 = new Heroe("Heroe 4", lista0);

    public List<ActividadesRescate> getObjetos() {

        return List.of(
                objeto1,
                objeto2,
                objeto3,
                objeto4,
                objeto5,
                objeto6,
                objeto7,
                objeto8,
                objeto9,
                objeto10,
                objeto11,
                objeto12
        );
    }
}