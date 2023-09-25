package com.codedifferentlty.labs.partC;

import java.util.Scanner;

public class TerminalApp {

    private void printMenu() {
        System.out.println("\nWelcome to City Guide - Points of Interest (POI) Finder!");
        System.out.println("========================================================");
        System.out.println("1. Add a new POI");
        System.out.println("2. Search for a POI by name");
        System.out.println("3. Rate a POI");
        System.out.println("4. List all POI");
        System.out.println("5. Delete a POI");
        System.out.println("0. Exit");
    }

    private void option1() {
        System.out.println("You selected Option 1.");
        // Add relevant code for Option 1 functionality
    }

    private void option2() {
        System.out.println("You selected Option 2.");
        // Add relevant code for Option 2 functionality
    }

    private void option3() {
        System.out.println("You selected Option 3.");
        // Add relevant code for Option 3 functionality
    }

    private void option4() {
        System.out.println("You selected Option 4.");
        // Add relevant code for Option 3 functionality
    }

    private void option5() {
        System.out.println("You selected Option 5.");
        // Add relevant code for Option 3 functionality
    }


    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
                case 5:
                    option5();
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        TerminalApp app = new TerminalApp();
        app.start();
    }
}
