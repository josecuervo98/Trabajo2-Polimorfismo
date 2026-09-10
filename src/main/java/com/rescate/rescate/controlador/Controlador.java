package com.rescate.rescate.controlador;

import com.rescate.rescate.modelo.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class Controlador {

    Rescate rescate1 = new Rescate(
            "Parque Arví",
            "Accidente",
            "Carlos"
    );

    Rescate rescate2 = new Rescate(
            "Estación Industriales",
            "Incendio",
            "María"
    );

    Rescate rescate3 = new Rescate(
            "Cerro El Volador",
            "Persona perdida",
            "Andrés"
    );

    ActividadesRescate objeto1 = new Bombero(rescate1);
    ActividadesRescate objeto2 = new Bombero(rescate2);
    ActividadesRescate objeto3 = new Bombero(rescate3);

    ActividadesRescate objeto4 = new Paramedico(rescate1);
    ActividadesRescate objeto5 = new Paramedico(rescate2);
    ActividadesRescate objeto6 = new Paramedico(rescate3);

    ActividadesRescate objeto7 = new Heroe(rescate1);
    ActividadesRescate objeto8 = new Heroe(rescate2);
    ActividadesRescate objeto9 = new Heroe(rescate3);

    ActividadesRescate[] rescates = {
            objeto1,
            objeto2,
            objeto3,
            objeto4,
            objeto5,
            objeto6,
            objeto7,
            objeto8,
            objeto9
    };
    Rescate[] datosRescate = {
            rescate1,
            rescate2,
            rescate3,
            rescate1,
            rescate2,
            rescate3,
            rescate1,
            rescate2,
            rescate3
    };

    @GetMapping("/")
    public String mostrarRescates(Model model) {

        String resultado = "";

        for (int i = 0; i < rescates.length; i++) {

            ActividadesRescate actividad = rescates[i];
            Rescate rescate = datosRescate[i];

            resultado += actividad.localizar(rescate);
            resultado += "<br>";

            resultado += actividad.salvar(rescate);
            resultado += "<br>";

            resultado += actividad.asistir(rescate);
            resultado += "<br><br>";
        }

        model.addAttribute("resultado", resultado);

        return "index";
    }
}
