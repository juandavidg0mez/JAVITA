package com.soccer.view;

import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;
import com.soccer.Controller;
import java.util.Scanner;
public class viewPlayer {
       public static Controller controlador;
   
       public void start() {
       
           Scanner scanner = new Scanner(System.in);
   
           while (true) {
               System.out.println("1. Crear Equipo");
               System.out.println("2. Actualizar Equipo");
               System.out.println("3. Buscar Equipo");
               System.out.println("4. Eliminar Equipo");
               System.out.println("5. Listar todos Equipos");
               System.out.println("6. Salir");
                 int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println(
                            "---------------------------------[CREAR EQUIPOS]--------------------------------- ");
              //       Player player = new Player();
              //       String codigoEquipo = null;
              //       System.out.println("Ingrese el codigo del equipo :");
              //       c);odigoEquipo = scanner.nextLine();
              //       System.out.println("Ingrese Nombre del equipo :");
              //       equipo.setNombre(scanner.nextLine());
              //       System.out.println("Ingrese la ciudad :");
              //       equipo.setCiudad(scanner.nextLine());
              //       controlador.equipos.put(codigoEquipo, equipo
              //       break;
                     }  
              }
       }
}