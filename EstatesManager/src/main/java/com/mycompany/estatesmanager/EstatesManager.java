/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estatesmanager;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class EstatesManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area activeArea = new GymArea();
        String activeName = "Gym";

        while (true) {
            System.out.print("Enter command (S/W/N/Y/Z/R/Q): ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "S":
                    System.out.print("Select area (G = Gym, P = Swimming): ");
                    String areaChoice = scanner.nextLine().toUpperCase();
                    if (areaChoice.equals("G")) {
                        activeArea = new GymArea();
                        activeName = "Gym";
                    } else if (areaChoice.equals("P")) {
                        activeArea = new SwimmingArea();
                        activeName = "Swimming";
                    } else {
                        System.out.println("Invalid area. Try again.");
                    }
                    break;

                case "W":
                    System.out.print("Enter number of occupants to add: ");
                    int w = getValidInt(scanner, 1, Integer.MAX_VALUE);
                    activeArea.addOccupants(w);
                    break;

                case "N":
                    System.out.print("Enter number of occupants to remove: ");
                    int n = getValidInt(scanner, 1, Integer.MAX_VALUE);
                    activeArea.removeOccupants(n);
                    break;

                case "Y":
                    System.out.print("Enter light number to switch ON (1–3): ");
                    int y = getValidInt(scanner, 1, 3);
                    activeArea.switchOnLight(y);
                    break;

                case "Z":
                    System.out.print("Enter light number to switch OFF (1–3): ");
                    int z = getValidInt(scanner, 1, 3);
                    activeArea.switchOffLight(z);
                    break;

                case "R":
                    activeArea.reportStatus(activeName);
                    break;

                case "Q":
                    System.out.println("Exiting program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }

    private static int getValidInt(Scanner scanner, int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) return value;
            } catch (NumberFormatException e) {}
            System.out.print("Invalid input. Enter a number between " + min + " and " + max + ": ");
        }
    }
}