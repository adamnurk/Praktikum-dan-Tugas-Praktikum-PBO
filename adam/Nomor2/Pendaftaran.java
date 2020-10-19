package com.adam.Nomor2;

public class Pendaftaran {
    String nama;
    private int tanggal_lhr;
    private int bulan_lhr;
    private int tahun_lhr;
    int nim;

    public Pendaftaran(String nama, int nim, int tanggal_lhr, int bulan_lhr, int tahun_lhr) {
        this.nama = nama;
        this.nim = nim;
        this.tanggal_lhr = tanggal_lhr;
        this.bulan_lhr   = bulan_lhr;
        this.tahun_lhr   = tahun_lhr;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public int getTanggal_lhr() {
        return tanggal_lhr;
    }

    public int getBulan_lhr() {
        return bulan_lhr;
    }

    public int getTahun_lhr() {
        return tahun_lhr;
    }

}

