package com.campusdual.exercisespoo.exerciseAnimals;

public class Pez extends Animal{
    private String habitat;
    private String colorAleta;
    private String alimentacion;

    //Constructor
    public Pez(double altura, double peso, int edad, String habitat, String colorAleta, String alimentacion) {
        super(altura, peso, edad);
        this.habitat = habitat;
        this.colorAleta = colorAleta;
        this.alimentacion = alimentacion;
    }

    //Getter y Setter
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColorAleta() {
        return colorAleta;
    }

    public void setColorAleta(String colorAleta) {
        this.colorAleta = colorAleta;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
}
