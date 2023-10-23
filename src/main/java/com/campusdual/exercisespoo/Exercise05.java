package com.campusdual.exercisespoo;

public class Exercise05 {
    // Comprobar si un número es positivo o negativo. Mayor o menor que 0
    // Comprobar si un número es múltiplo de otro. Resto de la división en 0
    // Comprobar si un número es menor a otro. Mayor que el otro

    public static void main(String[] args) {
        System.out.println("Comprobar si el número es positivo o negativo:");
        esPositivo(4);

        int numero = 10; // El número a comprobar
        int divisor = 5; // El número a verificar si es múltiplo

        esMúltiplo(numero, divisor);

        int numero1= 6;
        int numero2= 6;

        esMayor(numero1, numero2);
    }

    public static void esPositivo(int numero) {
        if (numero >= 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
    }

    public static void esMúltiplo(int numero, int divisor) {
        if (numero % divisor == 0) {
            System.out.println(numero + " es múltiplo de " + divisor);
        } else {
            System.out.println(numero + " no es múltiplo de " + divisor);
        }
    }
public static void esMayor(int numero1, int numero2){
    if (numero1 < numero2) {
        System.out.println(numero1 + " es menor que " + numero2);
    } else if (numero1 > numero2) {
        System.out.println(numero1 + " es mayor que " + numero2);
    } else {
        System.out.println(numero1 + " es igual a " + numero2);
    }
}
}