package com.campusdual.exercisespoo;

public class Exercise04 {
    // Sumar los primeros 5 números naturales
    // Sumar los primeros 20 números pares
    // Calcular el factorial de un números

    public static void main(String[] args) {
        System.out.print("El resultado de sumar los 5 oprimeros números es: ");
        System.out.println(sumarPrimeros());
        System.out.print("Sumar los primeros 20 números pares: ");
        System.out.println(sumarPares());
        System.out.print("Calcular el factorial de 7: ");
        System.out.println(factorial());
    }
        public static int sumarPrimeros (){
            int sumarPrimeros= 1+2+3+4+5;
            return sumarPrimeros;
}

public static int sumarPares(){
        int suma= 2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38+40;
        return suma;
}

public static int factorial(){
        int fact= 7*6*5*4*3*2*1;
        return fact;
}
    }
