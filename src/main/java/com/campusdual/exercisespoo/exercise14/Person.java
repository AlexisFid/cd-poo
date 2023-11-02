package com.campusdual.exercisespoo.exercise14;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void personalDetails(){
        System.out.println("El nombre de la persona es "+ this.getName() + " y su apellido es " +this.getSurname());
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe");
        p1.personalDetails();
    }
}
