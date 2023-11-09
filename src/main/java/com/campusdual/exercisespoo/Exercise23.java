package com.campusdual.exercisespoo;

import com.campusdual.exercisespoo.exercise14.Doctor;
import com.campusdual.exercisespoo.exercise14.Person;
import com.campusdual.exercisespoo.exercise14.PoliceOfficer;
import com.campusdual.exercisespoo.exercise14.Teacher;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {
    // Colecciones Mapas
    public static void main(String[] args) {
        Map<String, Person> customMap = new HashMap<>();

        customMap.put("person", new Person("John","Smith"));
        customMap.put("teacher", new Teacher("María","Montessori","Educación"));
        customMap.put("police", new PoliceOfficer("Jake","Peralta","B-99"));
        customMap.put("doctor", new Doctor("Gregory","House","Nefroloxía e infectoloxía"));

        customMap.get("teacher").getDetails();
        customMap.remove("teacher");

        System.out.println("Contén a clave \"police\": "+ customMap.containsKey("police"));
        System.out.println("Contén a clave \"teacher\": "+ customMap.containsKey("teacher"));

        customMap.put("police", new PoliceOfficer("Charles","Boyle","B-99"));
        System.out.println("Contén a clave \"police\": "+ customMap.containsKey("police"));
        customMap.get("police").getDetails();
    }
}
