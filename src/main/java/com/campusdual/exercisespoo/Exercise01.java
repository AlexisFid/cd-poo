package com.campusdual.exercisespoo;

public class Exercise01 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(3+5);
        System.out.println(3-2);
        System.out.println(4*3);
        System.out.println(5/2);
        System.out.println(5%2);
        String cnv = "200";
        int cnvInt = Integer.parseInt(cnv);
        System.out.println(cnv+1);
        System.out.println(cnvInt+1);
        cnv = cnv+1;
        cnvInt= cnvInt+1;
        String cnvStr =String.valueOf(cnvInt);
        char cnvChar = cnvStr.charAt(2);
        //1= "1" = 1.0 =true = "true"
        //0 = "0" = 0.0 =false = "false"
        //2 = "2" = 2.00000 = true = "true"
        int i=1;
        String iStr = String.valueOf(i);
        Double iDouble = Double.valueOf(iStr);
        String iDStr =String.valueOf(iDouble);
        System.out.println(Boolean.valueOf("true"));
    }
}