package com.webdev.solid3.ISP;

public class ObtenerImpuestosPorIdentificacion {

    public GetTaxesInformation service;

    public Double taxes(String identification) {
        return service.getTaxes(identification);
    }
}
