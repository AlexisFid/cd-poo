package com.campusdual.exercisespoo.exercise16;

public class Tractor implements IMachine{
    protected double hp;

    public Tractor(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public void start() {
        System.out.println("El tractor está encendido");
    }

    @Override
    public void stop() {
        System.out.println("El tractor está apagado");
    }

    @Override
    public void maintenance() {
        System.out.println("El tractor está en mantenimiento");
    }

    public void forward(){
        System.out.println("El tractor avanza");
    }

    public void backward(){
        System.out.println("El tractor retrocede");
    }
    public String getDetails(){
        return "La potencia es: "+ this.getHp() + " caballos";
    }
}
