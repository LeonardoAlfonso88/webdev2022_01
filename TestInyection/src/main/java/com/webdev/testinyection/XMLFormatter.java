package com.webdev.testinyection;

public class XMLFormatter implements Formatter{

    @Override
    public String format(String text) {
        return "<att=text>".concat(text).concat("</att>");
    }
}
