package com.campusdual.exercisespoo;

public class CustomObjectEncapsulatedPrivate {
    private int actualFuel = 10; //cambio de public a private
    private static String fuelLabel = "Gasolina";

    public int getActualFuel(){
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("Capacidad no puede ser negatva");
        }
    }

    public static String getFuelLabel(){
        return CustomObjectEncapsulatedPrivate.fuelLabel;
    }

    public static void setFuelLabel(String fuelLabel){
        CustomObjectEncapsulatedPrivate.fuelLabel= fuelLabel;
    }

    public void showDetails() {
        System.out.println("Tipo de combustible: "+ CustomObjectEncapsulatedPrivate.getFuelLabel());
    }

    public static void main(String[] args) {
        CustomObjectEncapsulatedPrivate cO= new CustomObjectEncapsulatedPrivate(); //Creación instancia clase CustumObject
        cO.showDetails(); //acceso de forma no estática al método del objeto(de la instancia)
        CustomObjectEncapsulatedPrivate.setFuelLabel("Diesel"); //acceso de forma estática al método de la clase
        cO.showDetails();
        System.out.println("Tipo de combustible: "+ CustomObjectEncapsulatedPrivate.getFuelLabel());
    }
}
