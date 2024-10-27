package com.mylib;

public abstract class MessageFormatter {
    // Méthode abstraite à définir par les applications
    public abstract String formatMessage(String message);

    // Méthode non abstraite utilisant la méthode abstraite
    public String prepareMessage(String message) {
        return "Message: " + formatMessage(message);
    }
}
