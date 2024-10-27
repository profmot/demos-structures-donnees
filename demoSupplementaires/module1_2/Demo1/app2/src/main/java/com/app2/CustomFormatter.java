package com.app2;

import com.mylib.MessageFormatter;

public class CustomFormatter extends MessageFormatter {
    
    @Override
    public String formatMessage(String message) {
        // Formatage spécifique pour App2 en minuscule
        return "App2: " + message.toLowerCase();
    }
}
