package com.mylib;

public class MessagePrinter {
    private final MessageFormatter formatter;

    public MessagePrinter(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public void printMessage(String message) {
        String preparedMessage = formatter.prepareMessage(message);
        System.out.println(preparedMessage);
    }
}
