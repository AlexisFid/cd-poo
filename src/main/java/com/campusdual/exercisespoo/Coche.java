package com.campusdual.exercisespoo;

import javax.swing.*;

public class Coche {
    public String Marca;
    public String Modelo;
    public int VelocidadMaxima;
    public String Combustible;
    public int Velocimetro = 0;
    public int Tacometro = 0;

    public Coche(String Marca, String Modelo, int VelocidadMaxima, String Combustible){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.VelocidadMaxima = VelocidadMaxima;
        this.Combustible = Combustible;
    }

    public void arrancar(){
        this.Tacometro = 1000;
        System.out.println("BRUMM");
    }

    public void apagar(){
        this.Tacometro = 0;
    }

    public int aceletar(){
        this.Velocimetro = this.Velocimetro +10;
        return this.Velocimetro;
    }

    public int frenar(){
        this.Velocimetro = this.Velocimetro -10;
        return this.Velocimetro;
    }

    public void girarVolante(int gradosGiro) {
        if (gradosGiro < 0) {
            System.out.println("Giro a la izquierda");
        } else {
            System.out.println("Giro a la derecha");
        }
    }
    
    }