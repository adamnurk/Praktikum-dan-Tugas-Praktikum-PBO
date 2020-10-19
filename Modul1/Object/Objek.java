package com.Adam.Modul1.Object;

public class Objek {
    public static void main(String[] args) {

        //Deklarasi objek tanpa parameter
       Mahasiswa mahasiswaTanpa = new Mahasiswa();

       mahasiswaTanpa.setNama("Adam");
       mahasiswaTanpa.setNim(19104078);

       System.out.println("Mahasiswa 1");
       System.out.println("nama\t:" + mahasiswaTanpa.getNama());
       System.out.println("Nim\t:" + mahasiswaTanpa.getNim());

       //deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Anjay",19104028);

        System.out.println("Mahasiswa 2");
        System.out.println("nama\t:" + mahasiswa.getNama());
        System.out.println("Nim\t:" + mahasiswa.getNim());
    }
}
