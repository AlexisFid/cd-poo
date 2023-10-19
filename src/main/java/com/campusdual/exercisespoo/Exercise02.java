package com.campusdual.exercisespoo;

public class Exercise02 {
    public static void main(String[] args) {
        //Área de un circulo = PI * r * r
        //Longitud de una circunferencia = PI * 2 * r
        //Área de un cuadrado = lado * lado

        double r = 7;
        double l = 2.5;

        System.out.print("Área del circulo: ");
        System.out.println(Math.PI*Math.pow(7,2));
        System.out.print("Longitud circunferencia: ");
        System.out.println(Math.PI*2*r);
        System.out.print("Área cuadrado: ");
        System.out.println(Math.pow(l,2));
        
    }
}
