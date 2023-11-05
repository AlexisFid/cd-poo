package com.campusdual.exercisespoo.exerciseAnimals;

public class Perro extends Mamifero{
    private String nombreCientifico;
    private String nombre;
    private String territorio;
    private String sonido;

    // Constructor
    public Perro(double altura, double peso, int edad, String habitat, String colorPelaje, String colorCola,
                 String nombreCientifico, String nombre, String territorio, String sonido) {
        super(altura, peso, edad, habitat, colorPelaje, colorCola);
        this.nombreCientifico = nombreCientifico;
        this.nombre = nombre;
        this.territorio = territorio;
        this.sonido = sonido;
    }

    // Getter y Setter
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public void presentarse(){
        System.out.println(getSonido() + " Mi nombre es "+ getNombre());
    }
}
