package com.campusdual.exercisespoo;

public class Cat {
    // Propiedades sin inicializar
    private String name;
    private String breed;
    private String sex;
    private static int age;
    private String hair;
    private static String colour;
    private static boolean castrated;

    // Propiedad inicializada
    private String eyeColour = "green";

    // Constructor
    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        Cat.age = age;
        this.hair = hair;
        Cat.colour = colour;
        Cat.castrated = castrated;
    }

    // Método estático color pelo gatos
    public static void changeHairColor(String newColour) {
        colour = newColour;
    }

    // Método cambiar color ojos gato
    public void changeEyeColor(String newEyeColour) {
        eyeColour = newEyeColour;
    }

    // Método estático edad gato
    public static void changeAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método edad gato
    public int getAge() {
        return Cat.age;
    }

    // Método estático castrar gato
    public void setCastrated(boolean castrated) {
        Cat.castrated = castrated;
    }

    // Método gato castrado o no
    public boolean isCastrated() {
        return this.castrated;
    }

    // Método características gato
    public void catDetails() {
        System.out.println("Nombre: " + this.name);
        System.out.println("Raza: " + this.breed);
        System.out.println("Sexo: " + this.sex);
        System.out.println("Edad: " + Cat.age + " meses");
        System.out.println("Tamaño del pelo: " + this.hair);
        System.out.println("Color del pelo: " + Cat.colour);
        System.out.println("Color de los ojos: " + this.eyeColour);
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Cat siameseCat = new Cat("Mia", "Siamese", "Hembra", 12, "Corto", "Marrón", false);
        Cat persianCat = new Cat("Leo", "Persian", "Macho", 24, "Largo", "Blanco", false);
        Cat sphynxCat = new Cat("Peludo", "Sphynx", "Hembra", 18, "Sin pelo", "Gris", false);

        // Cambiar color pelo dos primeros gatos
        changeHairColor("Gris claro");
        changeHairColor("Crema");

        // Cambiar color ojos gato esfinge
        sphynxCat.changeEyeColor("Ámbar");

        // Castrar dos primeros gatos
        siameseCat.setCastrated(true);
        persianCat.setCastrated(true);

        // Cambiar edad del último gato (valor negativo)
        changeAge(-6);

        // Detalles gato
        System.out.println("Detalles de Mia (Siamese):");
        siameseCat.catDetails();

        System.out.println("Detalles de Leo (Persian):");
        persianCat.catDetails();

        System.out.println("Detalles de Peludo (Sphynx):");
        sphynxCat.catDetails();
    }
}
