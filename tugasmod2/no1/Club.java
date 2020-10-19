package no1;

public class Club {
    String nama;
    int tahunBerdiri;
    String stadion;
    int juaraUcl;
    String deskripsi;

    // konstruktor pertama dengan Parameter kosong
    public Club(){
    }

    // konstraktor kedua, dengan 1 parameter (nama)
    public Club(String nama){
        this.nama = nama;
    }

    // konstraktor ketiga, dengan 2 parameter (nama, deskripsi)
    public Club(String nama, String deskripsi){
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    // konstraktor keempat, dengan 3 parameter (nama, tahunBerdiri, stadion)
    public Club(String nama, int tahunBerdiri, String stadion){
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    // konstraktor kelima, dengan 5 parameter (nama, tahunBerdiri, stadion, juaraUcl, deskripsi)
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }


    public void getTeam(){
        System.out.println("Nama Club\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Nama Stadion\t: " + stadion);
        System.out.println("Juara Ucl\t\t: " + juaraUcl);
        System.out.println("Deskripsi Club\t: " + deskripsi);
    }
}