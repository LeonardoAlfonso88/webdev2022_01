package com.webdev.solid3.ISP;

import java.util.List;

public interface GetTaxesInformation {
    public Double getTaxes(String identification);
    public List<Double> getAllTaxes();
}
