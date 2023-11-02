package com.campusdual.exercisespoo;

public class Cat {
    // Propiedades sin inicializar
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;

    // Propiedad inicializada
    private static String eyeColour = "green";

    // Constructor
    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    // Método estático cambiar color pelo gatos
    public static void changeHairColor(Cat cat, String newColour) {
        cat.colour = newColour;
    }

    // Método cambiar color ojos gato
    public void changeEyeColor(String newEyeColour) {
        eyeColour = newEyeColour;
    }

    // Método estático edad gato
    public static void changeAge(Cat cat, int newAge) {
        if (newAge >= 0) {
            cat.age = newAge;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método edad de un gato
    public int getAge() {
        return age;
    }

    // Método estático para castrar un gato
    public static void castrate(Cat cat) {
        cat.castrated = true;
    }

    // Método gato castrado o no
    public boolean isCastrated() {
        return castrated;
    }

    // Método características gato
    public void catDetails() {
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + breed);
        System.out.println("Sexo: " + sex);
        System.out.println("Edad: " + age + " meses");
        System.out.println("Tamaño del pelo: " + hair);
        System.out.println("Color del pelo: " + colour);
        System.out.println("Color de los ojos: " + eyeColour);
        System.out.println("Castrado: " + (castrated ? "Sí" : "No"));
        System.out.println("================================");
    }

    public static void main(String[] args) {
        Cat siameseCat = new Cat("Mia", "Siamese", "Hembra", 12, "Corto", "Marrón", false);
        Cat persianCat = new Cat("Leo", "Persian", "Macho", 24, "Largo", "Blanco", false);
        Cat sphynxCat = new Cat("Peludo", "Sphynx", "Hembra", 18, "Sin pelo", "Gris", false);

        // Cambiar color pelo dos primeros gatos
        Cat.changeHairColor(siameseCat, "Gris claro");
        Cat.changeHairColor(persianCat, "Crema");

        // Cambiar color ojos gato esfinge
        sphynxCat.changeEyeColor("Ámbar");

        // Castrar dos primeros gatos
        Cat.castrate(siameseCat);
        Cat.castrate(persianCat);

        // Cambiar edad del último gato (valor negativo)
        Cat.changeAge(sphynxCat,-6);

        // Detalles gato
        System.out.println("Detalles de Mia (Siamese):");
        siameseCat.catDetails();

        System.out.println("Detalles de Leo (Persian):");
        persianCat.catDetails();

        System.out.println("Detalles de Peludo (Sphynx):");
        sphynxCat.catDetails();
    }
}
