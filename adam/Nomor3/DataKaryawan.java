package com.adam.Nomor3;

import java.util.Scanner;

public class DataKaryawan {
    private static void karyawan1() {
        System.out.println("Nama Karyawan\t\t: Paluyy");
        System.out.println("Alamat\t\t\t\t: Jalan Soekarno Hatta, nomor 34");
        System.out.println("Nomor Telpon\t\t: 082109306137");
        System.out.println("Email\t\t\t\t: Paluymntap@gmail.com");
    }

    private static void karyawan2(){
        System.out.println("Nama Karyawan\t\t: Mang Oleng");
        System.out.println("Alamat\t\t\t\t: Jalan Iron Man 11,nomor 222");
        System.out.println("Nomor Telpon\t\t: 082159837501");
        System.out.println("Email\t\t\t\t: Odadingironman@gmail.com");
    }

    private static void karyawan3(){
        System.out.println("Nama Karyawan\t\t: Adam Nur Kridabayu");
        System.out.println("Alamat\t\t\t\t: Jalan Tanpa nama, nomor 0001");
        System.out.println("Nomor Telpon\t\t: 082159375421");
        System.out.println("Email\t\t\t\t: AdamNk711@gmail.com");

    }

    private static void karyawan4(){
        System.out.println("Nama Karyawan\t\t: Feby Dwi Indah");
        System.out.println("Alamat\t\t\t\t: Jalan yang Berliku 12, nomor 0001");
        System.out.println("Nomor Telpon\t\t: 082153365821");
        System.out.println("Email\t\t\t\t: Febydwi294@gmail.com");

    }

    private static void karyawan5(){
        System.out.println("Nama Karyawan\t\t: Sukiman Sukijan");
        System.out.println("Alamat\t\t\t\t: Jalan Belimbing 2, nomor 0001");
        System.out.println("Nomor Telpon\t\t: 082159375421");
        System.out.println("Email\t\t\t\t: sukiman.su145@gmail.com");

    }

    private static int JumlahKaryawan(){
        return 5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("<<_Data Karyawan PT.Anugrah Sejahtera :v_>>");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Jumlah Karyawan\t: " + JumlahKaryawan());
        System.out.println("1.Paluyy");
        System.out.println("2.Mang Oleng");
        System.out.println("3.Adam Nur Kridabayu");
        System.out.println("4.Feby Dwi Indah");
        System.out.println("5.Sukiman Sukijan");
        System.out.print("Pilih Karyawan\t: ");
        int choice = scan.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                karyawan1();
                break;

            case 2:
                karyawan2();
                break;

            case 3:
                karyawan3();
                break;

            case 4:
                karyawan4();
                break;

            case 5:
                karyawan5();
                break;
        }
    }
}
