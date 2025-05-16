package com.example.app;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        LOGGER.info(() -> "Sum: " + calculator.sum(a, b));

        try {
            LOGGER.info(() -> "Division: " + calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            if (LOGGER.isLoggable(Level.SEVERE)) {
                String msg = "Error during division: " + e.getMessage();
                LOGGER.log(Level.SEVERE, msg, e);
            }
        }

        for (int i = 0; i < 3; i++) {
            final int iteration = i;
            LOGGER.info(() -> String.format("Iteration %d", iteration));
        }

        UserService userService = new UserService();
        userService.processUser(null); // Validación interna

        try (Scanner scanner = new Scanner(System.in)) {
            LOGGER.info("Enter a number:");
            int input = scanner.nextInt();
            LOGGER.info(() -> String.format("You entered: %d", input));
        } catch (Exception e) {
            if (LOGGER.isLoggable(Level.SEVERE)) {
                LOGGER.log(Level.SEVERE, String.format("Error reading input: %s", e.getMessage()), e);
            }
        }
    }
}