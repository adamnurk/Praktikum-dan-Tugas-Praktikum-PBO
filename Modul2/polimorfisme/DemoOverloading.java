package com.adam.polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu ("Bukti");
        Lagu lagu2 = new Lagu( "Halu","Feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
