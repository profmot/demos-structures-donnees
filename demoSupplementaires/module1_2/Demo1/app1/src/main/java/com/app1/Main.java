package com.app1;

import com.mylib.MessagePrinter;

public class Main {
    public static void main(String[] args) {
        CustomFormatter formatter = new CustomFormatter();
        MessagePrinter printer = new MessagePrinter(formatter);

        printer.printMessage("Hello from App1");
    }
}
