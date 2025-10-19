/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estatesmanager;

/**
 *
 * @author user
 */
public class Area {

    protected int occupants = 0;
    protected boolean[] lights = {false, false, false};

    public void addOccupants(int n) {
        if (n > 0) occupants += n;
    }

    public void removeOccupants(int n) {
        if (n > 0) occupants = Math.max(0, occupants - n);
    }

    public void switchOnLight(int light) {
        if (light >= 1 && light <= 3) lights[light - 1] = true;
    }

    public void switchOffLight(int light) {
        if (light >= 1 && light <= 3) lights[light - 1] = false;
    }

    public void reportStatus(String name) {
        System.out.println("\n--- " + name + " Status ---");
        System.out.println("Occupants: " + occupants);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + ": " + (lights[i] ? "ON" : "OFF"));
        }
        System.out.println("------------------------\n");
    }
}   

