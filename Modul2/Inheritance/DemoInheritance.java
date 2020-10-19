package com.adam.Inheritance;

import com.adam.Inheritance.A;
import com.adam.Inheritance.B;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclas = new B();

        System.out.println("Masukan Data Super Class");
        superclass.x = 10;
        superclass.y = 50;
        superclass.prinXY();

        subclas.x = 30;
        subclas.y =40;
        subclas.z = 10;
        subclas.prinXY();
        subclas.sumValue();
    }
}
