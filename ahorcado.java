package com.trainer.mutabilidad;

import java.util.ArrayList;
import java.util.Arrays;
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
            String letra = sc.nextLine();
            for (int i = 0; i < palabraSelecta.length(); i++) {
                if (String.valueOf(palabraSelecta.charAt(i)).equals(letra)) {
                    System.out.println(palabraguiones);
                    palabraguiones.setCharAt(i, String.valueOf(letra.charAt(0)));
                    System.out.println("monda");
                }
            }

        if (palabraSelecta.contains(letra)) {
            System.out.println("Letra");
            // for (int i = 0; i < longitud; i++) {
            //     if (palabraSelecta.charAt(i) == letra.charAt(0)) {
            //         palabraMostrada[i] = letra.charAt(0);
            //         }
            }else{
            contadorIntentos++;
            System.out.println("Intentos que llevas: " + contadorIntentos );
            }
            
        }
        
        
    

    }
    

}
