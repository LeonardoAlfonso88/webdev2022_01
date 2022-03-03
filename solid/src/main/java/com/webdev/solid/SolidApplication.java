package com.webdev.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SolidApplication {

    public static void main(String[] args) {
        List<Persona> empleados = new ArrayList<Persona>();
        empleados.add(new Persona(new Date(1988, 10, 03)));
        empleados.add(new Persona(new Date(2000, Calendar.FEBRUARY, 15)));
        empleados.add(new Persona(new Date(1998, 04, 26)));
        VerificadorCumples verificador = new VerificadorCumples();
        verificador.verificarPersonas(empleados);
    }
}
