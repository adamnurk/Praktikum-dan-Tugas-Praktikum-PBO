package com.adam.polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue(" Mati listrik");
        subClass.getValue(" Mati lampu");
    }
}