package com.webdev.solid;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    public Date FechaNacimiento;
    private SimpleDateFormat formateadorFecha;

    public Persona(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
        formateadorFecha = new SimpleDateFormat("MMdd");
    }

    public boolean EsMiCumple() {
        Date diaActual = new Date();
        return formateadorFecha.format(diaActual).equals(formateadorFecha.format(FechaNacimiento));
    }

    public boolean SoyViejo() {
        return true;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
