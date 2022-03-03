package com.webdev.solid3;

public class SMSFormatter implements Formatter{

    @Override
    public String format(String text) {
        String formatText = "...".concat(text).concat("...");
        String result = "OK";
        //String result =Servico para enviar a SMS(formatText)
        return result;
    }
}
