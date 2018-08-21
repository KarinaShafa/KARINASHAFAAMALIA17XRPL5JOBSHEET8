/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Js8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Aplikasi {
       public static void main(String[] args)
    {
        System.out.println("Nama: KARINA SHAFA AMALIA");
        System.out.println("No.absen: 17");
        System.out.println("Kelas: XRPL5");
        
        Scanner baca = new Scanner(System.in);
        double hasil;
        
        System.out.println("ASSALAMUALAIKUM SELAMAT DATANG DI KOS PUTRI ABC");
        System.out.print("Masukkan nomor kamar: ");
        int nomor = baca.nextInt();
        
        if(nomor < 10)
        {
            System.out.println("Lantai 1");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 15000;
            System.out.println("Harga :" + hasil);
        }
        else if(nomor < 20)
        {
            System.out.println("Lantai 2");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 20000;
            System.out.println("Hasil: " + hasil);
        }
        else if(nomor < 30)
        {
            System.out.println("Lantai 3");
            System.out.print("Masukkan jumlah hari: ");
            int hari = baca.nextInt();
            hasil = hari * 25000;
            System.out.println("Harga: " + hasil );
        }
        else
        {
            System.out.println("Tidak Tersedia");
        }
        
    
    
    }
    
}
