package com.campusdual.exercisespoo;

public class CatEncapsulated {
    private String name;
    private String breed;
    private String sex;
    private int ageInMonths;
    private String hair;
    private String colour;
    private boolean castrated;

    private String eyeColour = "green";

    // Constructor
    public CatEncapsulated(String name, String breed, String sex, int ageInMonths, String hair, String colour, boolean castrated) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.ageInMonths = ageInMonths;
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

    // Getters y setters para ageInMonths
    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        if (ageInMonths >= 0) {
            this.ageInMonths = ageInMonths;
        } else {
            System.out.println("La edad no puede ser un valor negativo.");
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

    // cambiar color ojos
    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    // Método características del gato
    public void catDetails() {
        System.out.println("Nombre: " + getName());
        System.out.println("Raza: " + getBreed());
        System.out.println("Sexo: " + getSex());
        System.out.println("Edad: " + getAgeInMonths() + " meses");
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
        sphynxCat.setAgeInMonths(-6);

        // Mostrar detalles gato
        System.out.println("Detalles de Mia (Siamese):");
        siameseCat.catDetails();

        System.out.println("Detalles de Leo (Persian):");
        persianCat.catDetails();

        System.out.println("Detalles de Peludo (Sphynx):");
        sphynxCat.catDetails();
    }
}
