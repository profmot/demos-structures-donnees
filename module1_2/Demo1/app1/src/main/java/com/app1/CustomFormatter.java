package com.app1;

import com.mylib.MessageFormatter;

public class CustomFormatter extends MessageFormatter {
    @Override
    public String formatMessage(String message) {
        // Formatage spécifique pour App1 en majuscule
        return "App1: " + message.toUpperCase();
    }
}
