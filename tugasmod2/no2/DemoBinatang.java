package no2;

public class DemoBinatang {
    public static void main(String[] args) {

        // Inisiasi Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Pipit";
        burung.bergerak = "Menggunakan Sayap";
        burung.bernafas = "Menggunakan Paru-Paru dan Pundi-Pundi Udara";
        burung.reproduksibrng = "Bertelur";

        System.out.println("\t\t\t <<~~~~ DAFTAR BINATANG ~~~>>");
        System.out.println();
        // Memanggil Method
        burung.getNama();
        burung.binatang();
        burung.reproduksibrng();

        System.out.println();

        // Inisiasi Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Piranha";
        ikan.bergerak = "Menggunakan Sirip";
        ikan.bernafas = "Menggunakan Insang";
        ikan.reproduksiikn = "Bertelur";

        System.out.println();

        // Memanggil Method
        ikan.getNama();
        ikan.binatang();
        ikan.reproduksiikn();

        System.out.println();

        // Inisiasi Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Anggora";
        kucing.bergerak = "Menggunakan Kaki";
        kucing.bernafas = "Menggunakan Paru-Paru";
        kucing.reproduksikcng = "Melahirkan";

        System.out.println();

        // Memanggil Method
        kucing.getNama();
        kucing.binatang();
        kucing.reproduksikcng();
    }
}
