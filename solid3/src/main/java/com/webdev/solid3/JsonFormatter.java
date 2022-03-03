package com.webdev.solid3;

public class JsonFormatter implements Formatter{

    @Override
    public String format(String text) {
        return "{ 'text': ".concat(text).concat("}");
    }
}
