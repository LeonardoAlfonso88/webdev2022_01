package com.webdev.testinyection;

public class Cliente {

    public Formatter formatter;

    public Cliente(Formatter formatter) {
        this.formatter = formatter;
    }

    public void publish(String text) {
        String textFormat = this.formatter.format(text);
        System.out.println(textFormat);
    }
}
