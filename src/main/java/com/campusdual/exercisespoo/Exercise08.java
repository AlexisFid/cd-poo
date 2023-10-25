package com.campusdual.exercisespoo;

import java.util.Scanner;

// Bucles while y do-while
public class Exercise08 {
/*Pedir al usuario su nombre y mostrar por pantalla un mensaje de bienvenida */
    public static void mostrarSaludo(){
        Scanner scan = new Scanner(System.in);
        String nombreUsuario;

        System.out.println("Introduce nombre");
        nombreUsuario = scan.next();
        System.out.println("Hola " + nombreUsuario + "! ¿Como estas?");
    }
    /*Pedir al usuario un numero mayor que 5 y mostrarlo por pantalla*/
    public static void pedirNumero() {
        Scanner scan = new Scanner(System.in);
        int numeroParaMostrar;
        do {
            System.out.println("Introduce un numero mayor que 5");
            numeroParaMostrar = scan.nextInt();
        } while (numeroParaMostrar < 5);
        System.out.println("El numero que has escrito es: " + numeroParaMostrar);
    }

    public static void main(String[] args) {
        mostrarSaludo();
        pedirNumero();
    }
}
