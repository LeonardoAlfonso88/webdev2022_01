package com.webdev.testinyection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormatterController {

    private Cliente cliente;

    @Autowired
    public FormatterController(Cliente cliente) {
        this.cliente = cliente;
    }

    @RequestMapping("/format")
    public void execute() {
        cliente.publish("Texto Ejemplo");
    }
}
