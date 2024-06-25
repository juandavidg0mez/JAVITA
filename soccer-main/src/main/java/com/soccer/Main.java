package com.soccer;

import java.util.Scanner;

import com.soccer.view.viewPlayer;
import com.soccer.view.viewTeam;

public class Main {
    public static Controller controlador;
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Visitar Equipos");
            System.out.println("2. Visitar Jugadores");
            System.out.println("3. Visitar Doctores");
            System.out.println("4. Visitar Coach");
            System.out.println("5. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Controller ctrlTeams = new Controller();
                    viewTeam.controlador = ctrlTeams;
                    viewTeam vt = new viewTeam();
                    vt.start();
                    break;
                case 2:
                    Controller ctrlplayer = new Controller();
                    viewPlayer.controlador = ctrlplayer;
                    viewPlayer vp = new viewPlayer();
                    vp.start();
                    break;
                default:
                    break;
            }
        }




       // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
}