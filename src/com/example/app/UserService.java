package com.example.app;

import java.util.logging.Logger;
import java.util.logging.Level;

public class UserService {

    private static final Logger logger = Logger.getLogger(UserService.class.getName());

    public void processUser(String name) {
        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("User: %s", name.toUpperCase()));
        }
    }

    public void doNothing() {
        // Método vacío
    }

    public void longMethod() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        for (int i = 0; i < 10; i++) {
            total += i;
        }

        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.format("Total acumulado: %d", total));
        }
    }
}
