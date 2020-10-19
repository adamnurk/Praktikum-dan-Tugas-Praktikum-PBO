package com.Adam.Modul1.Pass;


import javafx.scene.control.skin.TextAreaSkin;

//Class main
    public class Pass {
        public static void main (String[] args){
            int nomer1, nomer2;

            TestPass pased = new TestPass(58,100);
            nomer1 = 10;
            nomer2 = 20;

            System.out.println("nilai sebelum passed by value\t :");
            System.out.println("nomer\t:" + nomer1 );
            System.out.println(" nomer\t:" + nomer2);

            pased.calculate(nomer1,nomer2);
            System.out.println("nilai setelah passed by value\t :");
            System.out.println("nomer\t:" + nomer1 );
            System.out.println("nomer\t:" + nomer2);
            System.out.println();

            //Passed  by refrence
            System.out.println("nilai sebelum passed by refrence\t :");
            System.out.println("pased.nomer\t: " + pased.nomer1 );
            System.out.println("pased.nomer\t: " + pased.nomer2);

            pased.calculate(pased);
            System.out.println("nilai sebelum passed by refrence\t :");
            System.out.println("pased.nomer\t: " + pased.nomer1 );
            System.out.println("pased.nomer\t: " + pased.nomer2);
        }

    }


