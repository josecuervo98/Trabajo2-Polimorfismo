package com.rescate.rescate.controlador;

import com.rescate.rescate.repositories.RepositorioRescates;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.rescate.rescate.modelo.Rescate;
import java.util.List;

@Controller
public class Controlador {

    RepositorioRescates repositorio = new RepositorioRescates();

    @GetMapping("/")
    public String inicio(Model model) {

        String nombres = repositorio.objeto1.getNombre() + ", "
                + repositorio.objeto2.getNombre() + ", "
                + repositorio.objeto3.getNombre() + ", "
                + repositorio.objeto4.getNombre() + ", "
                + repositorio.objeto5.getNombre() + ", "
                + repositorio.objeto6.getNombre() + ", "
                + repositorio.objeto7.getNombre() + ", "
                + repositorio.objeto8.getNombre() + ", "
                + repositorio.objeto9.getNombre() + ", "
                + repositorio.objeto10.getNombre() + ", "
                + repositorio.objeto11.getNombre() + ", "
                + repositorio.objeto12.getNombre();

        model.addAttribute("nombres", nombres);

        List<String> mensajes = repositorio.getObjetos().stream()
                .flatMap(objeto -> List.of(
                        objeto.localizar(objeto.getRescates()),
                        objeto.salvar(objeto.getRescates()),
                        objeto.asistir(objeto.getRescates())
                ).stream())
                .toList();

        model.addAttribute("mensajes", mensajes);

        List<Rescate> todosLosRescates = List.of(
                        repositorio.objeto1,
                        repositorio.objeto2,
                        repositorio.objeto3,
                        repositorio.objeto4,
                        repositorio.objeto5,
                        repositorio.objeto6,
                        repositorio.objeto7,
                        repositorio.objeto8,
                        repositorio.objeto9,
                        repositorio.objeto10,
                        repositorio.objeto11,
                        repositorio.objeto12
                ).stream()
                .flatMap(objeto -> objeto.getRescates().stream())
                .toList();
        int cantidad = todosLosRescates.size();
        int suma = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .sum();
        double promedio = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .average()
                .orElse(0);
        int minimo = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .min()
                .orElse(0);

        int maximo = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .max()
                .orElse(0);

        List<String> lugares = todosLosRescates.stream()
                .map(Rescate::getLugar)
                .toList();

        boolean existeIncendio = todosLosRescates.stream()
                .anyMatch(rescate -> rescate.getEmergencia().equals("Incendio"));

        boolean existeCarlos = todosLosRescates.stream()
                .anyMatch(rescate -> rescate.getPersona().equals("Carlos"));

        boolean noExistePedro = todosLosRescates.stream()
                .noneMatch(rescate -> rescate.getPersona().equals("Pedro"));

        Rescate rescateMayorValor = todosLosRescates.stream()
                .max((r1, r2) -> r1.getValor().compareTo(r2.getValor()))
                .orElse(null);

        model.addAttribute("rescateMayorValor", rescateMayorValor);
        model.addAttribute("existeIncendio", existeIncendio);
        model.addAttribute("existeCarlos", existeCarlos);
        model.addAttribute("noExistePedro", noExistePedro);
        model.addAttribute("lugares", lugares);
        model.addAttribute("cantidad", cantidad);
        model.addAttribute("suma", suma);
        model.addAttribute("promedio", promedio);
        model.addAttribute("minimo", minimo);
        model.addAttribute("maximo", maximo);

        return "index";
    }

    @GetMapping("/punto1")
    public String punto1(Model model) {

        String nombres = repositorio.objeto1.getNombre() + ", "
                + repositorio.objeto2.getNombre() + ", "
                + repositorio.objeto3.getNombre() + ", "
                + repositorio.objeto4.getNombre() + ", "
                + repositorio.objeto5.getNombre() + ", "
                + repositorio.objeto6.getNombre() + ", "
                + repositorio.objeto7.getNombre() + ", "
                + repositorio.objeto8.getNombre() + ", "
                + repositorio.objeto9.getNombre() + ", "
                + repositorio.objeto10.getNombre() + ", "
                + repositorio.objeto11.getNombre() + ", "
                + repositorio.objeto12.getNombre();

        model.addAttribute("nombres", nombres);

        return "punto1";
    }

    @GetMapping("/punto2")
    public String punto2(Model model) {

        List<Rescate> todosLosRescates = repositorio.getObjetos().stream()
                .flatMap(objeto -> objeto.getRescates().stream())
                .toList();

        int cantidad = todosLosRescates.size();

        int suma = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .sum();

        double promedio = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .average()
                .orElse(0);

        int minimo = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .min()
                .orElse(0);

        int maximo = todosLosRescates.stream()
                .mapToInt(Rescate::getValor)
                .max()
                .orElse(0);

        model.addAttribute("cantidad", cantidad);
        model.addAttribute("suma", suma);
        model.addAttribute("promedio", promedio);
        model.addAttribute("minimo", minimo);
        model.addAttribute("maximo", maximo);

        return "punto2";
    }

    @GetMapping("/punto3")
    public String punto3(Model model) {

        List<Rescate> todosLosRescates = repositorio.getObjetos().stream()
                .flatMap(objeto -> objeto.getRescates().stream())
                .toList();

        List<String> lugares = todosLosRescates.stream()
                .map(Rescate::getLugar)
                .toList();

        model.addAttribute("lugares", lugares);

        return "punto3";
    }

    @GetMapping("/punto4")
    public String punto4(Model model) {

        List<Rescate> todosLosRescates = repositorio.getObjetos().stream()
                .flatMap(objeto -> objeto.getRescates().stream())
                .toList();

        boolean existeIncendio = todosLosRescates.stream()
                .anyMatch(rescate -> rescate.getEmergencia().equals("Incendio"));

        boolean existeCarlos = todosLosRescates.stream()
                .anyMatch(rescate -> rescate.getPersona().equals("Carlos"));

        boolean noExistePedro = todosLosRescates.stream()
                .noneMatch(rescate -> rescate.getPersona().equals("Pedro"));

        model.addAttribute("existeIncendio", existeIncendio);
        model.addAttribute("existeCarlos", existeCarlos);
        model.addAttribute("noExistePedro", noExistePedro);

        return "punto4";
    }

    @GetMapping("/punto5")
    public String punto5(Model model) {

        List<Rescate> todosLosRescates = repositorio.getObjetos().stream()
                .flatMap(objeto -> objeto.getRescates().stream())
                .toList();

        Rescate rescateMayorValor = todosLosRescates.stream()
                .max((r1, r2) -> r1.getValor().compareTo(r2.getValor()))
                .orElse(null);

        model.addAttribute("rescateMayorValor", rescateMayorValor);

        return "punto5";
    }
}