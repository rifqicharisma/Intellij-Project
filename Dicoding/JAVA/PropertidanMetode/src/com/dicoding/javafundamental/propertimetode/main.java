package com.dicoding.javafundamental.propertimetode;

public class main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();


        System.out.println("Umurnya adalah " + kucing);

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("indeks massa tubuhnya adalah " + bmi);

    }
}
