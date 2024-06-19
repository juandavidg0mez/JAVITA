package com.example;

import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         String nombre = "camilo";
//         String apellido = "Perez";
//         System.out.println(nombre + " " + apellido);
//         System.out.println(nombre.concat(" ").concat(apellido).concat(" Es la monda"));

//     }
// }

// public class Main {

//     public static void main(String[] args){
//         String mensaje = "he man\ncomo vas";
//         String tabla = "Nombre\tApellido\tedad";
//         String retroceso = "123\b45";
//         String ruta = "C:\\Users\\Usuarios\\Documentos";
//         String comillas = "\"Esto es una cita\"";
//         System.out.println(mensaje);
//         System.out.println(tabla);
//         System.out.println(retroceso);
//         System.out.println(ruta);
//         System.out.println(comillas); 
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         @SuppressWarnings({"resource"})
//         Scanner  sc = new Scanner(System.in);
//         String nombre;
//         System.out.println("ingrese el nombre de la persona");
//         nombre = sc.nextLine();
//         System.out.println(nombre);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         @SuppressWarnings({ "resource" })
//         Scanner sc = new Scanner(System.in);
//         int edad = 0;
//         System.out.println("ingrese edad de la persosna");
//         edad = sc.nextInt();
//         if (edad >= 18 && edad <= 40) {
//             System.out.println("mayopr edad");
//         } else if (edad > 10 && edad < 18) {
//             System.out.println("Persona es adolescente");
//         } else if (edad > 1 && edad < 10) {
//             System.out.println("Persona es un nino");
//         } else {
//             System.out.println("es un adulto mayor");
//         }
//     }
// }

// public class Main {
//     @SuppressWarnings({"resource"})
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int dia = 0;
//         System.out.println("ingrese un dia de la semana del 1 al 7");
//         dia = sc.nextInt();
//         switch (dia) {
//             case 1:
//                 System.out.println("Es el dia Lunes socio");
//                 break;
//             case 2:
//                 System.out.println("El dia es martes");
//             break;
//             case 3:
//             System.out.println("miercoles");
//             break;
//             case 4:
//             System.out.println("jueves");
//             break;
//             case 5:
//             System.out.println("viernes wiiiiiiiiiiiiiii");
//             break;
//             case 6:
//             System.out.println("el sabado brutal");
//             break;
//             case 7:
//             System.out.println("Domingo de resureccion");
//             break;
//             default:
//             System.out.println("valor no valido");
//                 break;
//         }

//     }
// }

// Estructuras ciclicas

// public class Main {
//     @SuppressWarnings({"resource"})
//        public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int contador = 0;
//         while (contador < 3) {
//             System.out.println("ciclo while finito");
//             contador++;
//         }
//     }
// }

// DO WHILE

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int contador = 0;
//         do {
//             System.out.println("proceo");
//             contador++;
//         } while (contador <= 3);
//     }
// }

// FOR
// public class Main {

//     public static void main(String[] args) {
//         for (int i = 1; 1 <=10; i++) {
//             System.out.println("numero : "+i);
//         }
//     }
// }

// para saber si la letra esta en la cadena creo una variable que la recorra y donde remplace en la cadena inical
// podemosutilizar un while para hacer los intentos o mientras el el numero de vidas disponibles sea diferente a 0 esta bien
// recorrer el array y de forma randomica mi escoja la palabra entre ese array y apartir de ahi empezar a hacer los ciclos que me permiten recorrer el vector y comprar con la letra ingresa si no es se le resta una vida

//ASIGNAR VALORES A LOS ELEMENTOS DEL ARRAY

// int[] numeros = new int[5];
// numeros[0] = 10;
// numeros[1] = 20;
// numeros[2] = 30;
// numeros[3] = 40;
// numeros[4] = 50;

// public class Main {

//     public static void main(String[] args) {
//         String[] palabras = {"perro", "gato", "ballena"};
//         for (int i = 0;i < palabras.length; i++) {
            
//             System.out.println("palabras en indice " + i + " :" + palabras[i]);
//         }

//     }
// }

// podemos definir una clase como partida y de ahi asisnar los metodos randomico,  resta de oportunidades por errores al momento de ingrlesar la letra.
public class Main {

    public static void main(String[] args) {
        int[] numero = {10, 20, 30, 40, 50};
        for (int i : numero) {
            System.out.println(i);
            if (i== 20) {
                System.out.println("es igual a 20");
            }
        }
    }
}