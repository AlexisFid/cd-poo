package com.campusdual.exercisespoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {
    //Colecciones Listas
    public static List<String> createArrayList(){

        List<String> myList = new ArrayList<>();
        myList.add("GKFFD");
        myList.add("TNANA");
        myList.add("MPMSL");
        myList.add("PSWME");
        myList.add("LZMLF");
        myList.add("JYEBV");
        myList.add("YELNT");
        myList.add("JSNKR");
        myList.add("JFESF");
        myList.add("TMJLL");

        return myList;
    }

    public static void printList(List<String> list){
        for (String s: list){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        List<String> arrayList = createArrayList();
        arrayList.add("AAAAA");
        arrayList.add("BBBBB");
        System.out.println(arrayList);
    }
}
