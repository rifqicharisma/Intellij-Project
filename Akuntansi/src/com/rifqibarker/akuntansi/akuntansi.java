package com.rifqibarker.akuntansi;

import java.util.Scanner;

public class akuntansi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======AKUNTANSI DASAR======");
        System.out.println("1. Hitung Harta(Aset)");
        System.out.print("Masukkan inputan : ");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("1. Rumus Pertama : Harta = Utang + Modal");
            System.out.println("2. Rumus Kedua : Harta + Beban = Utang + Modal + Pendapatan");
            System.out.print("Masukkan Inputan Rumus : ");
            int rumus = scanner.nextInt();

            switch (rumus) {
                case 1:
                    System.out.print("Masukkan Utang : ");
                    int utang = scanner.nextInt();
                    System.out.print("Masukkan Modal : ");
                    int modal = scanner.nextInt();
                    int harta = modal + utang;
                    System.out.println("Jumlah Harta Anda Adalah " + harta);
                    break;

                case 2:
                    System.out.print("Masukkan Utang : ");
                    int u = scanner.nextInt();
                    System.out.print("Masukkan Modal : ");
                    int m = scanner.nextInt();
                    System.out.print("Masukkan Pendapatan : ");
                    int pendapatan = scanner.nextInt();
                    int h = u + m + pendapatan;
                    System.out.println("Jumlah Harta Anda Adalah " + h);
                    break;

                default:
                    System.out.println("Data yang anda inputkan salah !!!");
                    break;

            }

        } else {
            System.out.println("Data yang anda inputkan salah !!!!");
        }

    }
}
