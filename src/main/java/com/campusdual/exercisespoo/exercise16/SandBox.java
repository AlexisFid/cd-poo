package com.campusdual.exercisespoo.exercise16;

public class SandBox {
    public static void main(String[] args) {
       IMachine p1= new Plane("Airbus");
       IMachine t1 = new Tractor(1200);

        p1.start();
        p1.stop();
        p1.maintenance();
//        p1.fly();
//        p1.land();
//        p1.takeoff();
        t1.start();
        t1.stop();
        t1.maintenance();
//        t1.forward();
//        t1.backward();
//        System.out.println(p1.getDetails());
//        System.out.println(t1.getDetails());

        ((Plane)p1).fly();
    }
}
