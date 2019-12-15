package com.dicoding.javafundamental.accessmodifier;

public class main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        System.out.println(kelasA.functionB());

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);

        //kode ini tidak bisa memanggil dari package yang berbeda
    }
}
