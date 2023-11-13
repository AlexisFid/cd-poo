package com.campusdual.exercisespoo.exercise27;

public class Exercise27 {
    public static int division(int dividendo, int divisor){
        try{                                                    //Crear excepción para que funcione
            String texto = "-\\_(Ox0)_/-";
            texto.toLowerCase();
            System.out.println(texto);
            return dividendo/divisor;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
            throw e;
        } catch (NullPointerException e1){
                System.out.println("Lo quesea");
                throw e1;
        } finally {
            System.out.println("Método terminado");
        }
    }
    public static void main(String[] args) {
        System.out.println(division(15,0));
    }
}
