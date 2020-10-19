package no2;

public class Burung extends Binatang{
    // Inisiasi variabel
    public String nama;
    public String reproduksibrng;

    //getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t\t: " + nama);
    }

    public void reproduksibrng(){
        System.out.println("Berkembang Biak\t\t: " + reproduksibrng);
    }
}
