package com.campusdual.exercisespoo;

import com.campusdual.util.Utils;

import java.util.Scanner;

// Bucles while y do-while
public class Exercise08 {
/*Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida -->Scanner*/
    public static void mostrarSaludo(){
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;

        System.out.println("Introduce nombre");
        nombreUsuario = scan.next();
        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }

/*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla -->Scanner*/
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }

/*Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida -->Utils*/
    public static void mostrarSaludoConUtils(){
        String nombreUsuario = Utils.string("Introduce nombre: ");
        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }

/*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla -->Utils*/
    public static void pedirNumeroConUtils() {
        int numeroParaMostrar;
        do {
            numeroParaMostrar = Utils.integer("Introduce un numero mayor que 5: ");
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }

    public static void main(String[] args) {
        mostrarSaludo();
        pedirNumero();
        mostrarSaludoConUtils();
        pedirNumeroConUtils();
    }
}
