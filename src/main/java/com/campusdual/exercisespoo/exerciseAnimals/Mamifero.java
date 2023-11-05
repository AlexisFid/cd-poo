package com.campusdual.exercisespoo.exerciseAnimals;

public class Mamifero extends Animal {
    private String habitat;
    private String colorPelaje;
    private String colorCola;

    //Constructor
    public Mamifero(double altura, double peso, int edad, String habitat, String colorPelaje, String colorCola) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorPelaje = colorPelaje;
        this.colorCola =colorCola;
    }

    //Getter y Setter
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getColorCola() {
        return colorCola;
    }

    public void setColorCola(String colorCola) {
        this.colorCola = colorCola;
    }
}