package latihan1;

import java.util.Scanner;

public class main {
    public static void main(System[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===MENU HITUNG LUAS===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Persegi Panjang");
        System.out.println("3. Luas Segitiga");
        System.out.print("Masukkan Nomor Inputan : ");
        int value1 = scanner.nextInt();

        if(value1==1){
            System.out.print("Masukkan Panjang Sisi : ");
            int sisi = scanner.nextInt();
            int hasil = sisi*sisi;
            System.out.println(" adalah hasil luas persegi" + hasil);
        }
    }
}
