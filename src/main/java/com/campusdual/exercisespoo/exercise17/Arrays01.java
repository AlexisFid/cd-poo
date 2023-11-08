package com.campusdual.exercisespoo.exercise17;

import javax.swing.*;

public class Arrays01 {

    public static void main(String[] args) {

    // Declaración e inicializacion de los arrays
        int [] intArray = new int[3];
        String [] stringArray = {"1","2","3"};

    // Establecer datos del array - El elemeto dentro del parentisis es el índice
        intArray[0] =10;
        intArray[1] =9;
        intArray[2] =8;

    // Mostrar datos posicion array - Se busca por índice
        System.out.println(intArray[0] + intArray[3]); // Para mostrar varios datos se debe poner +
        System.out.println(stringArray[0]);

    // Mostrar longuitud array
        System.out.println(intArray.length);
        System.out.println(stringArray.length);
    }
}
