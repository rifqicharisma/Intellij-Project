package com.function;
import java.util.Scanner;

public class fungsi {
    //membuat pilihan input user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======KALKULATOR======");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Perkalian");
        System.out.println("3. Pembagian");
        System.out.println("4. Pengurangan");
        System.out.println("5. Perpangkatan");
        System.out.println();
        System.out.print("Input Pilihan : ");
        int input = scanner.nextInt();
        System.out.println();

        //membaut logika if else untuk input
        if(input ==1){
            System.out.print("Masukkan Angka Pertama : ");
            int x = scanner.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int y = scanner.nextInt();
            float hasil = jumlah(x,y);
            System.out.println();
            System.out.println("Hasil : " + hasil);
        }else if(input==2){
            System.out.print("Masukkan Angka Pertama : ");
            int x = scanner.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int y = scanner.nextInt();
            float hasil = kali(x,y);
            System.out.println();
            System.out.println("Hasil : " + hasil);
        }else if(input==3){
            System.out.print("Masukkan Angka Pertama : ");
            int x = scanner.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int y = scanner.nextInt();
            float hasil = bagi(x,y);
            System.out.println();
            System.out.println("Hasil : " + hasil);
        }else if(input==4){
            System.out.print("Masukkan Angka Pertama : ");
            int x = scanner.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int y = scanner.nextInt();
            float hasil = kurang(x,y);
            System.out.println();
            System.out.println("Hasil : " + hasil);
        }else if(input==5){
            System.out.print("Masukkan Angka Pertama : ");
            int x = scanner.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int y = scanner.nextInt();
            float hasil = pangkat(x,y);
            System.out.println();
            System.out.println("Hasil : " + hasil);
        }else{
            System.out.println("Angka yang anda inputkan salah!!!!!");
        }
    }

    //membaut fungsi untuk inputan
    public static float jumlah(float x, float y){
        float hasil = x+y;
        return hasil;
    }
    public static int kali(int x, int y){
        int hasil = x*y;
        return  hasil;
    }
    public static float bagi(float x, float y){
        float hasil = x/y;
        return hasil;
    }
    public static int kurang(int x, int y){
        int hasil = x-y;
        return hasil;
    }
    public static float pangkat(float x, float y){
        float loop = y-1, hasil = x;
        for(int i =1; i <= loop; i++){
            hasil = hasil*x;
        }
        return hasil;
    }

}
