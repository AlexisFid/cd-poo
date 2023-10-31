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

    // Propiedad con valor inicializado
    private static String eyeColour = "green";

    // Constructor para crear un gato con propiedades iniciales
    public Cat(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    // Método estático para cambiar el color del pelo de todos los gatos
    public static void changeHairColor(Cat cat, String newColour) {
        cat.colour = newColour;
    }

    // Método para cambiar el color de los ojos de un gato
    public void changeEyeColor(String newEyeColour) {
        eyeColour = newEyeColour;
    }

    // Método estático para cambiar la edad de un gato
    public static void changeAge(Cat cat, int newAge) {
        cat.age = newAge;
    }

    // Método para obtener la edad de un gato
    public int getAge() {
        return age;
    }

    // Método estático para castrar un gato
    public static void castrate(Cat cat) {
        cat.castrated = true;
    }

    // Método para verificar si un gato está castrado o no
    public boolean isCastrated() {
        return castrated;
    }

    // Método para mostrar las características de un gato
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
        Cat.changeHairColor(siameseCat, "Gris claro");
        Cat.changeHairColor(persianCat, "Crema");

        persianCat.changeEyeColor("Azul"); // Cambiar el color de los ojos del gato persa
        sphynxCat.changeEyeColor("Ámbar"); // Cambiar el color de los ojos del gato esfinge

        Cat.castrate(siameseCat);
        Cat.castrate(persianCat);

        siameseCat.catDetails();
        persianCat.catDetails();
        sphynxCat.catDetails();
    }
}
