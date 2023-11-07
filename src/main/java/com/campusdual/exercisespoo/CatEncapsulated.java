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

    public CatEncapsulated(String name, String breed, String sex, int age, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.hair = hair;
        this.colour = colour;
        this.castrated = castrated;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public String getHair() {
        return this.hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isCastrated() {
        return this.castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getEyeColour() {
        return this.eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void catDetails() {
        System.out.println("Nombre: " + this.getName());
        System.out.println("Raza: " + this.getBreed());
        System.out.println("Sexo: " + this.getSex());
        System.out.println("Edad: " + this.getAge() + " meses");
        System.out.println("Tamaño del pelo: " + this.getHair());
        System.out.println("Color del pelo: " + this.getColour());
        System.out.println("Color de los ojos: " + this.getEyeColour());
        System.out.println("Castrado: " + (this.isCastrated() ? "Sí" : "No"));
        System.out.println("================================");
    }

    public static void main(String[] args) {
        CatEncapsulated siameseCat = new CatEncapsulated("Mia", "Siamese", "Hembra", 12, "Corto", "Marrón", false);
        CatEncapsulated persianCat = new CatEncapsulated("Leo", "Persian", "Macho", 24, "Largo", "Blanco", false);
        CatEncapsulated sphynxCat = new CatEncapsulated("Peludo", "Sphynx", "Hembra", 18, "Sin pelo", "Gris", false);

        siameseCat.setCastrated(true);
        persianCat.setCastrated(true);
        siameseCat.setColour("Gris Claro");
        persianCat.setColour("Crema");
        sphynxCat.setEyeColour("Ámbar");
        sphynxCat.setAge(-6);

        System.out.println("Detalles de Mia (Siamese):");
        siameseCat.catDetails();

        System.out.println("Detalles de Leo (Persian):");
        persianCat.catDetails();

        System.out.println("Detalles de Peludo (Sphynx):");
        sphynxCat.catDetails();
    }
}
