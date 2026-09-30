package com.rescate.rescate.modelo;

import java.util.List;

public interface ActividadesRescate extends Localizar, Salvar, Asistir {

    String getNombre();

    List<Rescate> getRescates();

}