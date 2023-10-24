package com.campusdual.exercisespoo;

/*Sintaxis de for
 * El bucle for consta de 3 partes:
 * Una expresión de inicialización (se ejecuta al principio, asignando a la variable de control un valor inicial)
 * Una expresión de condición que hará que el bucle se mantenga mientras que se cumpla
 * Una expresión de incremento/decremento sobre la variable de control para conseguir la finalización del bucle
 * El código que se repetirá en cada iteración será el que vaya entre llaves*/

public class Exercise07 {
    //Mostrar los primeros 15 números naturales
    public static int sumNumbers(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++ ){
            sum += i; // Tambien funciona con sum= sum+i
        }
        return sum;
    }

    //Sumar los primeros 100 números naturales
    public static void printNNumbers(int num){
        for (int i = 0; i < num; i++){
            System.out.print((i+1)+ " ");
        }
        System.out.println();
    }

    //Mostrar por pantalla los 30 primeros números
    public static void mostrar30Numerospares(){
        for (int i=2; i <=60; i+=2){ // i+=2 --> i +2
            System.out.println(i);
        }
    }

    /* Calcular el cuadrado de los 20 primeros números naturales*/
    public static void cuadrado20(){
        for (int i = 1; i <= 20; i++) {
            int cuadrado = i * i;
            System.out.println("El cuadrado de " + i + " es " + cuadrado);
        }
    }

    /* Construye un metodo qeu por parámetro un aletra del abacedario muestre por pantalla cuantas letras
    faltan hasta llegar a la Z sin contar Ñ*/
    public static void contarLetras(char letra){
        int contador = 0;
        for (char i = letra; i <= 'Z'; i++){
            contador++;
        }
        System.out.println("Desde esa letra a la Z hay " + contador + " letras");
    }

    public static void main(String[] args) {

        printNNumbers(3);
        printNNumbers(22);
        printNNumbers(15);
        printNNumbers(13);

        System.out.println(sumNumbers(100));
        System.out.println(sumNumbers(10));
        System.out.println(sumNumbers(5));
        mostrar30Numerospares();
        cuadrado20();
        contarLetras('V');
    }
}