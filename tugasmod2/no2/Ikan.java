package no2;

public class Ikan extends Binatang{
    // Inisiasi variabel
    public String nama;
    public String reproduksiikn;

    // getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t\t: " + nama);
    }

    public void reproduksiikn(){
        System.out.println("Berkembang Biak\t\t: " + reproduksiikn);
    }
}
