package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.kereta;
import com.dicoding.javafundamental.basic.kendaraan.mobil;
import com.dicoding.javafundamental.basic.kendaraan.motor;
import com.dicoding.javafundamental.basic.musik.gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        gitar.bunyi();
        mobil.jumlahBan();
        motor.jumlahBan();
        kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);


    }
}
