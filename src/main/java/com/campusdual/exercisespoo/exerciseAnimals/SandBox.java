package com.campusdual.exercisespoo.exerciseAnimals;

public class SandBox {
    public static void main(String[] args) {
        Perro p1 = new Perro(110,23,10,"Domestico","Negro","Blanco",
                "Canis lupus familiaris","Balto","Hogar","Guau, Guau");
        Caballo c1 = new Caballo(158,400,20,"LLanuras","Marron Claro","Castaño","Equus caballus",
                "Spirit","LLanura"," ¡hiiii, hiiii, hiiii!");
        Halcon h1 = new Halcon(37,1,15,"Bosque","Gris","Amarillo",
                "Falco","hawk","Bosque","gañir");
        Pollo g1 = new Pollo(45,2,6,"Granja","Negro","Amarillo","Gallus gallus domesticus",
                "Calimero","Italia"," Tutti mi vogliono male perché sono piccolo e nero...");
        Delfin d1 = new Delfin(170,70,40,"Océanos del mundo","Azul","Peces","Delphinidae",
                "Flipper","Miami","iiii, iiii");
        Orca o1 = new Orca(9,5570,30,"Océanos del mundo","Negro","Otros mamíferos marinos","",
                "Willy,","Islandia","fwissshhhh");
        p1.presentarse();
        c1.presentarse();
        h1.presentarse();
        g1.presentarse();
        d1.presentarse();
        o1.presentarse();
    }
}
