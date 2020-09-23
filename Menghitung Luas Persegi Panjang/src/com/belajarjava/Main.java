package com.belajarjava;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

   Scanner input = new Scanner(System.in);

        System.out.print("MASUKKAN NILAI PANJANG =");
        int panjang;
        panjang = input.nextInt();
        System.out.println();

        System.out.print("MASUKKAN NILAI Lebar =");
        int lebar;
        lebar = input.nextInt();
        System.out.println();

        int hasil;
        hasil = panjang*lebar;
        System.out.println("Luas Dari Persegi Panjang adalah = " + hasil + " cm");

        System.out.print("MASUKKAN NILAI TINGGI = ");
        int tinggi;
        tinggi = input.nextInt();
        int volume;
        volume= hasil*tinggi;

        System.out.println("Volume Persegi Panjang = " + volume + " cm");

    }
}
