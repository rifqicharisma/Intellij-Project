package com.coba;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kesempatan = 0;
        boolean login = false;

        while (kesempatan != 3 && login == false){
            System.out.print("Masukkan username : ");
            String user = scanner.next();
            System.out.print("Masukkan password : ");
            String pass = scanner.next();
                if (user == "admin" && pass == "admin"){
                    System.out.println("Anda berhsil login\n");
                    login = true;
                }else{
                    System.out.println("User atau Password anda salah");
                    kesempatan ++;

                }
        }

        if (kesempatan==3){
            System.out.println("Akun anda diblokir!!!");
        }
    }
}
