package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPanel {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planet awal:");
        for(int i = 0; i< planets.size(); i ++){
            System.out.println("\t index-" + i +"=" + planets.get(i));
        }
        planets.remove("venus");
        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
