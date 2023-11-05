package com.campusdual.exercisespoo.exerciseAnimals;

public class Animal {
    protected double altura;
    protected double peso;
    protected int edad;

    // Constructor
    public Animal(double altura, double peso, int edad) {
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    // Getter y Setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
