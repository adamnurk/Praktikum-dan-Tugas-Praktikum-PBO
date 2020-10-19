package com.adam.Nomor2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoPendaftaran {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr    = new BufferedReader(isr);
        Scanner scan = new Scanner(System.in);
        String nama  = "";
        int nim, tanggal_lhr,bulan_lhr, tahun_lhr;
        //

        System.out.println();
        System.out.println("<<<<--Pendaftaran Mahasiswa Baru-->>>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        try {
            System.out.print("Masukan Nama\t: ");
            nama = bfr.readLine();
        } catch (IOException log) {
            log.printStackTrace();
        }

        System.out.print("Masukan NIM\t\t: ");
        nim = scan.nextInt();

        System.out.println("KETERANGAN ( Masukan Tanggal Lahir Dalam Bentuk Angka )");
        //untuk regist tanggal, bulan, dan tahun lahir
        System.out.print("Tanggal (tt)\t: ");
        tanggal_lhr = scan.nextInt();
        System.out.print("Bulan (BB)\t\t: ");
        bulan_lhr = scan.nextInt();
        System.out.print("Tanggal (TTTT)\t: ");
        tahun_lhr = scan.nextInt();

        Pendaftaran registe = new Pendaftaran(nama, nim, tanggal_lhr, bulan_lhr, tahun_lhr);
        System.out.println();

        //regist.get
        System.out.println("<<-Data Yang Telah Dimasukan->>");
        System.out.println();
        System.out.println("Nama\t\t\t: " + registe.getNama());
        System.out.println("NIM\t\t\t\t: " + registe.getNim());
        System.out.println("Tanggal Lahir\t: " + registe.getTanggal_lhr() + "/" + registe.getBulan_lhr() + "/" + registe.getTahun_lhr());

        System.out.println();
        System.out.println("<<-TERIMAKASIH TELAH MENDAFTAR->>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
