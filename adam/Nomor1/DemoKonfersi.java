package com.adam.Nomor1;

import java.util.Scanner;

public class DemoKonfersi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Suhu;
         int choice;

        System.out.print("Masukan Suhu\t: ");
        Suhu = scan.nextFloat();
        Konfersi temp = new Konfersi(Suhu);

        System.out.println("\tKeterangan\t:");
        System.out.println("\t1.Celcius\t");
        System.out.println("\t2.Fahrenheit\t");
        System.out.println("\t3.Kelvin\t");
        System.out.println("\t4.Reamur\t");

        System.out.print("Masukan Jenis Derajat Suhu : ");
        choice = scan.nextInt();
        System.out.println("Hasil Setelah DiKonfersi :");

        switch (choice) {
            case 1:
                temp.Celcius(temp);
                System.out.println("Celsius\t: " + temp.C);
                System.out.println("Fahrenheit\t: " + temp.F);
                System.out.println("Kelvin\t: " + temp.K);
                System.out.println("Reamur\t: " + temp.R);
                break;

            case 2:
                temp.Fahrenheit(temp);
                System.out.println("Celsius\t: " + temp.C);
                System.out.println("Fahrenheit\t: " + temp.F);
                System.out.println("Kelvin\t: " + temp.K);
                System.out.println("Reamur\t: " + temp.R);
                break;

            case 3:
                temp.Kelvin(temp);
                System.out.println("Celsius\t: " + temp.C);
                System.out.println("Fahrenheit\t: " + temp.F);
                System.out.println("Kelvin\t: " + temp.K);
                System.out.println("Reamur\t: " + temp.R);
                break;

            case 4:
                temp.Reamur(temp);
                System.out.println("Celsius\t: " + temp.C);
                System.out.println("Fahrenheit\t: " + temp.F);
                System.out.println("Kelvin\t: " + temp.K);
                System.out.println("Reamur\t: " + temp.R);
                break;
        }

    }

}
