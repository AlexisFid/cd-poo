package com.campusdual.exercisespoo;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String hair;
    private String colour;
    private boolean castrated;

    private String eyeColour = "green";

    // Constructor
    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    // Getters y setters para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters y setters para breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getters y setters para sex
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // Getters y setters para age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Getters y setters para hair
    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    // Getters y setters para colour
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Getters y setters para castrated
    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    // Cambiar color ojos
    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    // Método características del gato
    public void catDetails() {
        System.out.println("Nombre: " + getName());
        System.out.println("Raza: " + getBreed());
        System.out.println("Sexo: " + getSex());
        System.out.println("Edad: " + getAge() + " meses");
        System.out.println("Tamaño del pelo: " + getHair());
        System.out.println("Color del pelo: " + getColour());
        System.out.println("Color de los ojos: " + eyeColour);
        System.out.println("Castrado: " + (isCastrated() ? "Sí" : "No"));
        System.out.println("================================");
    }

    public static void main(String[] args) {
        CatEncapsulated siameseCat = new CatEncapsulated("Mia", "Siamese", "Hembra", 12, "Corto", "Marrón", false);
        CatEncapsulated persianCat = new CatEncapsulated("Leo", "Persian", "Macho", 24, "Largo", "Blanco", false);
        CatEncapsulated sphynxCat = new CatEncapsulated("Peludo", "Sphynx", "Hembra", 18, "Sin pelo", "Gris", false);

        // Castrar dos primeros gatos (cambiar booleano a true)
        siameseCat.setCastrated(true);
        persianCat.setCastrated(true);

        // Cambiar color del pelo dos primeros gatos
        siameseCat.setColour("Gris Claro");
        persianCat.setColour("Crema");

        // Cambiar color ojos último gato
        sphynxCat.setEyeColour("Ámbar");

        // Cambiar edad último gato (valor negativo)
        sphynxCat.setAge(-6);

        // Detalles gato
        System.out.println("Detalles de Mia (Siamese):");
        siameseCat.catDetails();

        System.out.println("Detalles de Leo (Persian):");
        persianCat.catDetails();

        System.out.println("Detalles de Peludo (Sphynx):");
        sphynxCat.catDetails();
    }
}
