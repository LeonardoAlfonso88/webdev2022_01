package com.webdev.solid;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class VerificadorCumples {

    public void verificarPersonas(List<Persona> personas) {
        for (Persona personaActual : personas) {
            System.out.println(personaActual.EsMiCumple());
        }
    }
}
