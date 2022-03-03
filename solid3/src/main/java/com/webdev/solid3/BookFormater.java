package com.webdev.solid3;

public class BookFormater implements Formatter{
    @Override
    public String format(String text) {
        return "'''''".concat(text).concat("~~~~~~");
    }
}
