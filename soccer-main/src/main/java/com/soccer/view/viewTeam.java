package com.soccer.view;

import java.security.PublicKey;
import java.util.Enumeration;
import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Team;

public class viewTeam {
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
                    Team equipo = new Team();
                    String codigoEquipo = null;
                    System.out.println("Ingrese el codigo del equipo :");
                    codigoEquipo = scanner.nextLine();
                    System.out.println("Ingrese Nombre del equipo :");
                    equipo.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la ciudad :");
                    equipo.setCiudad(scanner.nextLine());
                    controlador.equipos.put(codigoEquipo, equipo);
                    break;

                case 2:
                    System.out.println("ingresar codigo del equipo");
                    codigoEquipo = scanner.nextLine();

                    if (controlador.equipos.containsKey(codigoEquipo)) {
                        equipo = controlador.equipos.get(codigoEquipo);
                        System.out.println("Ingrese el nuevo nombre del equipo:");
                        equipo.setNombre(scanner.nextLine());
                        System.out.println("Ingrese la nueva ciudad del equipo:");
                        equipo.setCiudad(scanner.nextLine());
                        controlador.equipos.put(codigoEquipo, equipo);
                        System.out.println("Equipo actualizado correctamente: " + equipo.getNombre());
                    } else {
                        System.out.println("El equipo con el código " + codigoEquipo + " no existe por el momento.");
                    }
                    break;

                case 3:
                    Team eq = new Team();
                    String codigoE = "001";
                    eq = controlador.equipos.get(codigoE);
                    System.out.println("Mi equipo" + eq.getNombre());
                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("Ingresar codigo de Equipo para listar");
                    codigoEquipo = scanner.nextLine();

                    // if (controlador.equipos.contains(codigoEquipo)) {
                    //     equipo = controlador.equipos.get(codigoEquipo);
                    //     Enumeration<String> values = equipo.elements();
                    //     while (values.hasMoreElements()) {
                    //         Integer value = values.nextElement();
                    //         System.out.println(value);
                    //     }

                    // }

                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}