package com.dicoding.javafundamental.array;

public class loopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[50];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
