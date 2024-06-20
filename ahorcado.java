package com.trainer.mutabilidad;

import java.util.ArrayList;
import java.util.Scanner;

public class ahorcado {
   
    public static void main(String[] args) {
        ArrayList<String> listapalabras = new ArrayList<>();

        // Añadir elementos a la ArrayList
        listapalabras.add("perro");
        listapalabras.add("morado");
        listapalabras.add("tierra");
        listapalabras.add("externocleidomastoideo");
        listapalabras.add("casa");
        listapalabras.add("flor");
        listapalabras.add("java");
        listapalabras.add("aprendizaje");

        // for (String i : listapalabras) {
        //     System.out.println(i);
        // }
        int numeroEntero = (int) (Math.random() * 8);
        Scanner sc = new Scanner(System.in);

        StringBuilder palabraguiones = new StringBuilder();
        String palabraSelecta = listapalabras.get(numeroEntero);
        System.out.println("Welcome to the jungle tu palabra a adivinar es: " + palabraSelecta);
        int longitud = palabraSelecta.length();
         for (int i = 0; i < longitud; i++) {
            System.out.print("_");
            palabraguiones.append("_");
         }

        // char[] palabraMostrada = new char[longitud];
        // Arrays.fill(palabraMostrada, '_');


        int contadorIntentos = 0;

        while (contadorIntentos < 3) {
            System.out.print("Ingrese una letra: ");
            char letra = sc.nextLine().charAt(0);
            boolean letraEncontrada = false;
        
            for (int i = 0; i < palabraSelecta.length(); i++) {
                if (palabraSelecta.charAt(i)== letra) {
                    palabraguiones.setCharAt(i, letra);
                    letraEncontrada = true;
                }
            }
            System.out.println(palabraguiones);
        
            if (letraEncontrada) {
                System.out.println("Letra encontrada");
            } else {
                contadorIntentos++;
                System.out.println("Intentos que llevas: " + contadorIntentos);
            }
        
            if (palabraguiones.indexOf("_") == -1) {
                System.out.println("Felicidades, completaste la palabra: " + palabraguiones);
                break; // Salir del ciclo while
            }
        
            if (contadorIntentos == 3) {
                System.out.println("Has alcanzado el número máximo de intentos.");
            }
        
            
        }
        
        
    

    }
    

}
