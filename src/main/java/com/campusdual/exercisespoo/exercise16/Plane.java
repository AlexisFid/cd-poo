package com.campusdual.exercisespoo.exercise16;

public class Plane implements IMachine{
    protected String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("El avión está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El avión está apagado");
    }

    @Override
    public void maintenance() {
        System.out.println("El avión está en mantenimineto");
    }

    public void takeoff(){
        System.out.println("El avión aterriza");
    }

    public void land(){
        System.out.println("El avión aterriza");
    }

    public void fly(){
        System.out.println("El avión vuela");
    }

    public String getDetails(){
        return "El modelo es: "+ this.getName();
    }
}
