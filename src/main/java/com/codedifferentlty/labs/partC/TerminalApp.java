package com.codedifferentlty.labs.partC;

import com.codedifferentlty.labs.partD.CityGuide;
import com.codedifferentlty.labs.partD.POI;

import java.util.Scanner;

public class TerminalApp {

    CityGuide cityGuide = new CityGuide();

    private void printMenu() {
        System.out.println("\nWelcome to City Guide - Points of Interest (POI) Finder!");
        System.out.println("========================================================");
        System.out.println("1. Add a new POI");
        System.out.println("2. Search for a POI by name");
        System.out.println("3. Rate a POI");
        System.out.println("4. List all POI");
        System.out.println("5. Delete a POI");
        System.out.println("0. Exit");
        System.out.println();
    }

    private void option1() {
        System.out.println("Add a new POI:");
        System.out.println("---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter POI Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter POI Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter POI description: ");
        String description = scanner.nextLine();
        POI poi = new POI(name, address, description);
        cityGuide.addToAreas(poi, null);
        System.out.println("POI " + name + " added successfully!");
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
        System.out.println("List All POIs:");
        System.out.println("---------------");
        cityGuide.displayPOIs(cityGuide.getAreas());
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
