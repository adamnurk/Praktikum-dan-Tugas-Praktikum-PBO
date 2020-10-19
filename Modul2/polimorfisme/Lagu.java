package com.adam.polimorfisme;

public class Lagu {
    public String judul;
    public String pencipta;

    //overloding
    public Lagu(String judul) {
        this.judul = judul;
    }
    //over loading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu(){
        System.out.println("judul\t\t: " + judul);
        System.out.println("pencipta\t: " + pencipta);
        System.out.println();
    }

}
