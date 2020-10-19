package com.Adam.Modul1.Object;

public class Mahasiswa {
    String nama;
    int nim;

    //konstruktur
    public Mahasiswa(){}

    public Mahasiswa (String nama, int nim){
        this.nama = nama;
        this.nim  = nim;
    }

    //Getter & setter  (biar cpt pencet alt + insert)

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
