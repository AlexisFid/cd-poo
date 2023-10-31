package com.campusdual.exercisespoo;

public class CustomObject {
    public int actualFuel = 10;
    public static String fuelLabel = "Gasolina";

    public int getActualFuel(){
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel>=0) {
            this.actualFuel=actualFuel;
        } else {
            System.out.println("Capacidad no puede ser negatva");
        }
    }

    public static String getFuelLabel(){
        return CustomObject.fuelLabel;
    }

    public static void setFuelLabel(String fuelLabel){
        CustomObject.fuelLabel= fuelLabel;
    }

    public void showDetails() {
        System.out.println("Tipo de combustible: "+ CustomObject.getFuelLabel());
    }

    public static void main(String[] args) {
        CustomObject cO= new CustomObject(); //Creación instancia clase CustumObject
        cO.showDetails(); //acceso de forma no estática al método del objeto(de la instancia)
        CustomObject.setFuelLabel("Diesel"); //acceso de forma estática al método de la clase
        cO.showDetails();
        System.out.println("Tipo de combustible: "+ CustomObject.getFuelLabel());
    }
}
